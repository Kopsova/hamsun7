package com.greenfoxacademy;

import com.greenfoxacademy.model.ToDo;
import com.greenfoxacademy.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToDoMain implements CommandLineRunner {

    @Autowired
    TodoRepository repo;

    public static void main(String[] args) {
        SpringApplication.run(ToDoMain.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repo.save(new ToDo("I have to learn Object Relational Mapping", false, false));


    }
}
