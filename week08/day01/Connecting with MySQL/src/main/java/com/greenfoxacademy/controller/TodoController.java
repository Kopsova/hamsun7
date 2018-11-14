package com.greenfoxacademy.controller;

import com.greenfoxacademy.model.ToDo;
import com.greenfoxacademy.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/todo")
public class TodoController {
    @Autowired
    TodoRepository repo;

    @GetMapping({"/list", "/"})
    public String list(Model model, @RequestParam(value = "isActive", required = false) boolean active ) {
        List<ToDo> todos =(repo.findAll());
        if (active) {
            for (int i = 0; i < todos.size() ; i++) {
                if (todos.get(i).isDone()) {
                    todos.remove(i);
                }
            }
        }
        model.addAttribute("todos", todos);
        return "todolist";
    }









}
