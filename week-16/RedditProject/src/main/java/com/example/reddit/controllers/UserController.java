package com.example.reddit.controllers;

import com.example.reddit.models.Users;
import com.example.reddit.services.UserServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

  private final UserServiceImpl userService;

  @Autowired
  public UserController(UserServiceImpl userService) {
    this.userService = userService;
  }

  @GetMapping("/user/list")
  /*just to see if it works*/
  public String list(Model model) {
    List<Users> users;
    users = userService.findAllUsers();
    model.addAttribute("users", users);
    return "userlist";
  }

  @GetMapping("/registration")
  public String openRegistrationPage(Model model) {
    model.addAttribute("user", new Users());
    return "userregistration";
  }

  /*ok, not this way, unsafe data transfer, must use dto
  @PostMapping("/registration")
  public String registerNewUser(@RequestParam String uname, String email, String password) {
    this.userService.addUser(uname, email, password);
    return "redirect:/user/list";
  }
  */

}
