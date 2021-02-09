package com.example.sklepwarzywny;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {


    @GetMapping(value = "/redirect")
    public String redirect() {
        return "redirect:products";
    }

    @RequestMapping("/products")
    public String redirectToProducts() {
        return "redirect:products";
    }





}
