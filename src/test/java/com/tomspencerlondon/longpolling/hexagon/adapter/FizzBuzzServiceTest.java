package com.tomspencerlondon.longpolling.hexagon.adapter;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

import com.tomspencerlondon.longpolling.hexagon.domain.FizzBuzz;
import org.junit.jupiter.api.Test;

class FizzBuzzServiceTest {

  @Test
  void play15AddsResultOfFizzbuzz() {
    FizzBuzzService fizzBuzzService = new FizzBuzzService(new FizzBuzz());

    fizzBuzzService.play("15");

    String result = fizzBuzzService.result();

    assertThat(result)
        .isEqualTo("Fizzbuzz");
  }
}