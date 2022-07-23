package com.tomspencerlondon.longpolling.adapter.in.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class PollController {

  @GetMapping("/")
  public String home() {
    return "index";
  }

  @PostMapping("/fizzbuzz")
  public String fizzBuzz(@RequestParam(name = "number") Integer number, RedirectAttributes redirectAttributes) {
    redirectAttributes.addFlashAttribute("number", number);
    return "redirect:/fizzbuzz";
  }

  @GetMapping("/fizzbuzz")
  public String fizzBuzz() {
    return "fizzbuzz";
  }

  @PostMapping("/restart")
  public String restart() {
    return "redirect:/";
  }
}
