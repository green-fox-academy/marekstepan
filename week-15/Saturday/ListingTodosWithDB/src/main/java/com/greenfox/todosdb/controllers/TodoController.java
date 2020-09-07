package com.greenfox.todosdb.controllers;

import com.greenfox.todosdb.models.Todo;
import com.greenfox.todosdb.repositories.TodoRepository;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class TodoController {

  private final TodoRepository todoRepository;

  public TodoController(TodoRepository todoRepository){
    this.todoRepository = todoRepository;
  }

  @GetMapping(value= {"/list", "/"})
  public String list(Model model) {
    model.addAttribute("todos", todoRepository.findAll());
    return "todolist";
  }
}
