package com.tomspencerlondon.longpolling.adapter.in.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PollApiController {

  @PostMapping("/api/fizzbuzz")
  @ResponseStatus(HttpStatus.CREATED)
  public Integer fizzBuzz(@RequestParam Integer number) {
    return number - 1;
  }
}
