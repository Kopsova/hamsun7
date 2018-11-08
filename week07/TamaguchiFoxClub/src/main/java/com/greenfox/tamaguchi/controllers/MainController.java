package com.greenfox.tamaguchi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {


    @RequestMapping("/")
    public String homePage(Model model, @RequestParam(name="name") String name) {
        model.addAttribute("name",name);
        return "index";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String loginName(@RequestParam(name="name") String name) {
        return "redirect:/?name=" + name;

    }


}
