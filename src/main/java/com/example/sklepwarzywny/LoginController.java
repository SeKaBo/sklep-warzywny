package com.example.sklepwarzywny;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public ModelAndView login() {
        return new ModelAndView("login");
    }

    @GetMapping(value = "/redirect")
    public String redirect() {
        return "redirect:products";
    }

    @RequestMapping("/products")
    public String redirectToProducts() {
        return "redirect:products";
    }


}
