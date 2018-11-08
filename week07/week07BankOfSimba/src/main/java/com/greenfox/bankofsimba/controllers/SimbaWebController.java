package com.greenfox.bankofsimba.controllers;

import com.greenfox.bankofsimba.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SimbaWebController {

    @RequestMapping("/show")
    public String bankAccount(Model model) {
        BankAccount account = new BankAccount("Simba", 2000, "lion");
        model.addAttribute("account", account);
        return "Account";
    }
}
