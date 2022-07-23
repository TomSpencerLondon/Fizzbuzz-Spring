package com.tomspencerlondon.longpolling.hexagon.adapter;

import com.tomspencerlondon.longpolling.hexagon.domain.FizzBuzz;

public class FizzBuzzService {

  private FizzBuzz fizzBuzz;
  public FizzBuzzService(FizzBuzz fizzBuzz) {
    this.fizzBuzz = fizzBuzz;
  }

  public void play(String input) {
    fizzBuzz.next(Integer.parseInt(input));
  }

  public String result() {
    return fizzBuzz.result();
  }
}
