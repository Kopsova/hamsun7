package com.greenfox.wednesdayexcercises;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsefullUtilitiesController {


    @Autowired
    UtilityService color;


    @RequestMapping("/useful")
    public String homePage() {
        return "useful";
    }

    @RequestMapping("/useful/colored")
    public String RandomColorPage(Model model) {
        model.addAttribute("color", color.randomColor());
        return "colored";
    }
}
