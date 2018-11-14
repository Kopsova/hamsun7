package com.greenfoxacademy.repository;

import com.greenfoxacademy.model.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<ToDo, Long> {
}
