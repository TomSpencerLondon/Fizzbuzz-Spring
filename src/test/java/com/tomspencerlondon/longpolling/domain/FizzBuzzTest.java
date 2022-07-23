package com.tomspencerlondon.longpolling.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

  @Test
  void zeroReturnsEmptyString() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    String result = fizzBuzz.from(0);

    assertThat(result)
        .isEmpty();
  }

  @Test
  void oneReturnsNumberAsString() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    String result = fizzBuzz.from(1);

    assertThat(result)
        .isEqualTo("1");
  }

  @Test
  void twoReturnsNumberAsString() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    String result = fizzBuzz.from(2);

    assertThat(result)
        .isEqualTo("2");
  }

  @Test
  void threeReturnsFizz() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    String result = fizzBuzz.from(3);

    assertThat(result)
        .isEqualTo("Fizz");
  }

  @Test
  void fourReturnsNumberAsString() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    String result = fizzBuzz.from(4);

    assertThat(result)
        .isEqualTo("4");
  }

  @Test
  void fiveReturnsFizzBuzz() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    String result = fizzBuzz.from(5);

    assertThat(result)
        .isEqualTo("Fizzbuzz");
  }

  @Test
  void sixReturnsFizz() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    String result = fizzBuzz.from(6);

    assertThat(result)
        .isEqualTo("Fizz");
  }
}
