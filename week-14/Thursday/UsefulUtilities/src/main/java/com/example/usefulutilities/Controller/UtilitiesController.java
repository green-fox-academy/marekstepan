package com.example.usefulutilities.Controller;

import com.example.usefulutilities.Services.UtilityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UtilitiesController {

  private final UtilityService utilityService;

  public UtilitiesController(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

  @GetMapping("/useful")
  public String homepage() {
    return "homepage";
  }

  @GetMapping("/useful/colored")
  public String coloredBackground (Model model){
    model.addAttribute("color", utilityService.randomColor());
    return "coloredBackground";
  }

  @GetMapping("/useful/email")
  public String validate(Model model, @RequestParam String email){
    model.addAttribute("valid", utilityService.validateEmail(email));
    model.addAttribute("email", email);
    return "emailValidator";
  }

  @GetMapping("/useful/encode")
  public String encode(Model model, @RequestParam String text, @RequestParam Integer number){
    model.addAttribute("encoded", utilityService.caesar(text, number));
    return "caesarEncoding";
  }

  @GetMapping("/useful/decode")
  public String decode(Model model, @RequestParam String text, @RequestParam Integer number){
    model.addAttribute("decoded", utilityService.caesar(text, number));
    return "caesarDecoding";
  }
}
