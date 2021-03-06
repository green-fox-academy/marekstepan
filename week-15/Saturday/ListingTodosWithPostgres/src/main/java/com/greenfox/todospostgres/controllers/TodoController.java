package com.greenfox.todospostgres.controllers;

import com.greenfox.todospostgres.models.Todo;
import com.greenfox.todospostgres.services.TodoServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {

  private final TodoServiceImpl todoService;

  @Autowired
  public TodoController(TodoServiceImpl todoService) {
    this.todoService = todoService;
  }

  @GetMapping(value = {"/todo/list", "/todo"})

  public String list(@RequestParam(required = false) Boolean isActive, Model model) {
    List<Todo> todos;
    if (isActive == null) {
      todos = todoService.findAll();
    } else {
      todos = todoService.findNotDone();
    }
    model.addAttribute("todos", todos);
    return "todolist";
  }

  @GetMapping("/todo/add")
  public String addTodo(Model model) {
    model.addAttribute("todo", new Todo());
    return "addtodo";
  }

  @PostMapping("/todo/save")
  public String saveNewTodo(@RequestParam String title) {
    todoService.add(title);
    return "redirect:/todo/list";
  }

  @GetMapping("/todo/{id}/delete")
  public String deleteTodoById(@PathVariable long id) {
    todoService.deleteById(id);
    return "redirect:/todo/list";
  }

  @GetMapping("/todo/{id}/edit")
  public String editTodo(@PathVariable long id, Model model) {
    model.addAttribute("todo", this.todoService.findById(id));
    return "editTodo";
  }

  @PostMapping("/todo/edit")
  public String saveEditedTodo(@ModelAttribute ("todo") Todo todo, Model model) {
    model.addAttribute("todo", this.todoService.editById(todo));
    return "redirect:/todo/list";
  }
}
