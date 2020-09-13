package com.greenfox.todospostgres.controllers;

import com.greenfox.todospostgres.models.Assignee;
import com.greenfox.todospostgres.services.AssigneeServiceImpl;
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
public class AssigneeController {

  private final AssigneeServiceImpl assigneeService;

  @Autowired
  public AssigneeController(AssigneeServiceImpl assigneeService) {
    this.assigneeService = assigneeService;
  }

  @GetMapping(value = {"/todo/assignee/list"})

  public String list(Model model) {
    List<Assignee> assignees;
    assignees = assigneeService.findAll();
    model.addAttribute("assignees", assignees);
    return "assignees";
  }

  @GetMapping("/todo/assignee/add")
  public String addAssignee(Model model) {
    model.addAttribute("assignee", new Assignee());
    return "addAssignee";
  }

  @PostMapping("/todo/assignee/add")
  public String saveNewAssignee(@RequestParam String name, String email) {
    assigneeService.add(name, email);
    return "redirect:/todo/assignee/list";
  }

  @GetMapping("/todo/assignee/{id}/delete")
  public String deleteAssigneeById(@PathVariable long id) {
    assigneeService.deleteById(id);
    return "redirect:/todo/assignee/list";
  }

  @GetMapping("/todo/assignee/{id}/edit")
  public String editAssignee(@PathVariable long id, Model model) {
    model.addAttribute("assignee", this.assigneeService.findById(id));
    return "editAssignee";
  }

  @PostMapping("/todo/assignee/edit")
  public String saveEditedAssignee(@ModelAttribute("assignee") Assignee assignee, Model model) {
    model.addAttribute("assignee", this.assigneeService.editById(assignee));
    return "redirect:/todo/assignee/list";
  }
}
