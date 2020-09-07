package com.example.greenfoxclassapp.Controllers;

import com.example.greenfoxclassapp.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreenfoxClassController {

  private final StudentService studentService;

  @Autowired
  public GreenfoxClassController(StudentService studentService) {
    this.studentService = studentService;
  }

  @GetMapping("/gfa")
  public String homepage(Model model) {
    model.addAttribute("count", studentService.count());
    return "homepage";
  }

  @GetMapping("/gfa/list")
  public String listStudents(Model model) {
    model.addAttribute("students", studentService.findAll());
    model.addAttribute("count", studentService.count());
    return "list";
  }

  @GetMapping("/gfa/add")
  public String addStudent(Model model) {
    model.addAttribute("count", studentService.count());
    return "add";
  }

  @PostMapping("/gfa/save")
  public String saveStudent(@RequestParam String name) {
    studentService.save(name);
    return "redirect:/gfa";
  }

  @GetMapping("/gfa/check")
  public String check() {
    return "check";
  }

  @PostMapping("/gfa/check")
  public String checkStudent(@RequestParam String name, Model model) {
    model.addAttribute("count", studentService.count());
    model.addAttribute("name", name);
    model.addAttribute("isMember", studentService.isMember(name));
    return "check";
  }
}
