package com.example.sklepwarzywny.Registration;

import com.example.sklepwarzywny.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {

    @RequestMapping("/registration")
    public ModelAndView registration(Model model) {
        model.addAttribute("userForm", new UserForm());
        return new ModelAndView("registration");

//    }
//    @RequestMapping(value = "/registration", method = RequestMethod.GET)
//    public String index() {
//        return "registration";
//    }


    }
}
