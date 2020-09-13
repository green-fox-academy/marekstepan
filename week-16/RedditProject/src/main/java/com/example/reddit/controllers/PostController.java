package com.example.reddit.controllers;

import com.example.reddit.models.Post;
import com.example.reddit.services.PostServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PostController {

  private final PostServiceImpl postService;

  @Autowired
  public PostController(PostServiceImpl postService) {
    this.postService = postService;
  }

  @GetMapping("/")
  public String list(Model model) {
    List<Post> posts;
    posts = postService.findAllSortedByScore();
    model.addAttribute("posts", posts);
    return "postslist";
  }

  @GetMapping("/submit")
  public String addPost(Model model) {
    model.addAttribute("post", new Post());
    return "newpost";
  }

  @PostMapping("/submit")
  public String submitNewPost(@RequestParam String title, String url) {
    postService.add(title, url);
    return "redirect:";
  }

  @PostMapping("/vote/{id}")
  public String voteForPost(@PathVariable Long id, Integer vote) {
    postService.voteById(id, vote);
    return "redirect:/./";
  }
}
