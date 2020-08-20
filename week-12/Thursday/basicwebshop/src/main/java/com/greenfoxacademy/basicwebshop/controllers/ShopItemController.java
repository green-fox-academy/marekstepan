package com.greenfoxacademy.basicwebshop.controllers;

import static org.springframework.web.bind.annotation.RequestMethod.*;


import com.greenfoxacademy.basicwebshop.repository.Stock;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ShopItemController {
  Stock stock = new Stock();

  @GetMapping("/")
  public String homePage(Model model){
    model.addAttribute("shopItems", stock.getStock());
    return "index";
  }

  @GetMapping("/only-available")
  public String onlyAvailable(Model model) {
    model.addAttribute("shopItems", stock.filterAvailable());
    return "index";
  }

  @GetMapping("/cheapest-first")
  public String cheapestFirst(Model model) {
    model.addAttribute("shopItems", stock.cheapestFirst());
    return "index";
  }

  @GetMapping("/dried-items")
  public String driedItems(Model model) {
    model.addAttribute("shopItems", stock.filterDried());
    return "index";
  }

  @GetMapping("/average-stock")
  public String averageStock(Model model) {
    model.addAttribute("averageStock", stock.averageStock());
    return "average-stock";
  }

  @GetMapping("/most-expensive")
  public String mostExpenensive(Model model) {
    model.addAttribute("mostExpensive", stock.mostExpensive());
    return "most-expensive";
  }

  @PostMapping("/search")
  public String containsSearchedWord(Model model, @RequestParam String word) {
      model.addAttribute("shopItems", stock.containsSearched(word));
    return "index";
  }


}
