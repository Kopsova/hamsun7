package com.greenfox.bankofsimba.controllers;

import com.greenfox.bankofsimba.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ListAnimalsController {


    @RequestMapping("/showlist")
    public String listAccount(Model model) {
        List<BankAccount> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new BankAccount("Simba", 1000, "lion"));
        listOfAnimals.add(new BankAccount("Timon", 1500, "meerkat"));
        listOfAnimals.add(new BankAccount("Scar", 500, "lion"));
        listOfAnimals.add(new BankAccount("Nala", 4000, "lionesse"));
        model.addAttribute("listOfAnimals", listOfAnimals);
        return "listAnimals";
    }
}
