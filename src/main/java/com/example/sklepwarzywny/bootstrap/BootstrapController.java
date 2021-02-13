package com.example.sklepwarzywny.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class BootstrapController {


    private ElementService service;

    @Autowired
    public BootstrapController(ElementService serviceBean) {
        this.service = serviceBean;

    }

    @GetMapping("bootstrap")
    public ModelAndView bootstrapIndex() {
        Map<String, Object> data = new HashMap<>();
        List<BootstrapElement> elements = service.getAll();
        Long totalCount = elements.stream().map(BootstrapElement::getId).reduce(Long::sum).orElse(0l);
        data.put("sum", totalCount);
        data.put("elements", elements);
        return new ModelAndView("bootstrap-index",data);

    }

    @PostMapping("bootstrap")
    public ModelAndView addElement(@ModelAttribute("elementName")String name) {
        BootstrapElement newElement = new BootstrapElement();
        newElement.setDisplayName(name);
        service.add(newElement);
        Map<String, Object> data = new HashMap<>();
        // return "redirect: bootstrap";
        data.put("elements", service.getAll());
        return new ModelAndView("bootstrap-index",data);

    }

    @PostMapping("bootstrap/delete/{id}")
    public ModelAndView deleteElement(@PathVariable("id") Long id) {
        service.remove(id);
        Map<String, Object> data = new HashMap<>();
        data.put("elements", service.getAll());
        return new ModelAndView("bootstrap-index",data);
    }




}
