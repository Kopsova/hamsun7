package com.greenfox.tamaguchi.controllers;

import com.greenfox.tamaguchi.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    List <Fox> foxes ;

    List<Fox> newFox;

    public MainController() {
        foxes = new ArrayList<>();
        foxes.add(new Fox("Mr.Green","salad","water"));
        foxes.add(new Fox("Franky","chicken nuggets","Coke"));
        foxes.add(new Fox("Ms.Ginger","fruits","green tea"));

    }

    @RequestMapping("/")
    public String homePage(Model model, @RequestParam(name="name") String name) {
        for (int i = 0; i < foxes.size(); i++) {
            if (name.equals(foxes.get(i).getName())) {
                model.addAttribute("name", foxes.get(i));
            }
        }
        return "index";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String loginName(@RequestParam(name="name") String name) {
        for (int i = 0; i < foxes.size(); i++) {
            if (!name.equals(foxes.get(i).getName())) {
                newFox.add(new Fox(name));
            }

                return "redirect:/?name=" + name;

    }







}
