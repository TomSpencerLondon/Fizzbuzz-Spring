package com.tomspencerlondon.longpolling.adapter.in.api;

import com.tomspencerlondon.longpolling.hexagon.adapter.FizzBuzzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PollApiController {

  private final FizzBuzzService service;

  @Autowired
  public PollApiController(FizzBuzzService service) {
    this.service = service;
  }

  @PostMapping("/api/fizzbuzz")
  public ResponseEntity fizzBuzz(@RequestParam String number) {
    service.play(number);
    return ResponseEntity.ok(HttpStatus.OK);
  }

  @GetMapping("/api/fizzbuzz")
  @ResponseStatus(HttpStatus.ACCEPTED)
  public String fizzBuzzResponse() {
    return service.result();
  }
}
