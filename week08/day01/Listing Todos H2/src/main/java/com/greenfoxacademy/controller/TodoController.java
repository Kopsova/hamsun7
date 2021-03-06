package com.greenfoxacademy.controller;

import com.greenfoxacademy.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/todo")
public class TodoController {
    @Autowired
    TodoRepository repo;

    @GetMapping({"/list", "/"})
    public String list(Model model) {
        model.addAttribute("todos", repo.findAll());
        return "todolist";
    }


}
