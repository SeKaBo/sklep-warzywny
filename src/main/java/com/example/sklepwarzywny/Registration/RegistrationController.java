package com.example.sklepwarzywny.Registration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class RegistrationController {

    @RequestMapping("/registraton")
    public ModelAndView registration() {
        return new ModelAndView("registration");

//    }
//    @RequestMapping(value = "/registration", method = RequestMethod.GET)
//    public String index() {
//        return "registration";
//    }


    }
}
