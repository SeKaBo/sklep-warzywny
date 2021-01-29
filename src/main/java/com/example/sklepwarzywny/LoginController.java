package com.example.sklepwarzywny;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class LoginController {

    @RequestMapping("/login")
    public ModelAndView login() {
        return new ModelAndView("login");
    }

        @RequestMapping(value = "/redirect", method = RequestMethod.GET)
        public String redirect() {
            return "redirect:koszyk";
        }
        @RequestMapping(value = "/koszyk", method = RequestMethod.GET)
        public String koszyk() {
            return "koszyk";
    }
}
