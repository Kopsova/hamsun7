package com.greenfoxacademy.repository;

import com.greenfoxacademy.model.ToDo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<ToDo, Long> {
    @Override
    List<ToDo> findAll();
}
