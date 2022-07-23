package com.tomspencerlondon.longpolling.domain;

import static org.assertj.core.api.Assertions.assertThat;

import com.tomspencerlondon.longpolling.hexagon.domain.FizzBuzz;
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
        .isEqualTo("buzz");
  }

  @Test
  void sixReturnsFizz() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    String result = fizzBuzz.from(6);

    assertThat(result)
        .isEqualTo("Fizz");
  }

  @Test
  void sevenReturnsNumberAsString() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    String result = fizzBuzz.from(7);

    assertThat(result)
        .isEqualTo("7");
  }

  @Test
  void eightReturnsNumberAsString() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    String result = fizzBuzz.from(8);

    assertThat(result)
        .isEqualTo("8");
  }

  @Test
  void nineReturnsFizz() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    String result = fizzBuzz.from(9);

    assertThat(result)
        .isEqualTo("Fizz");
  }

  @Test
  void tenReturnsFizzbuzz() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    String result = fizzBuzz.from(10);

    assertThat(result)
        .isEqualTo("buzz");
  }

  @Test
  void elevenReturnsNumberAsString() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    String result = fizzBuzz.from(11);

    assertThat(result)
        .isEqualTo("11");
  }

  @Test
  void twelveReturnsFizz() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    String result = fizzBuzz.from(12);

    assertThat(result)
        .isEqualTo("Fizz");
  }

  @Test
  void thirteenReturnsNumberAsString() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    String result = fizzBuzz.from(13);

    assertThat(result)
        .isEqualTo("13");
  }

  @Test
  void fourteenReturnsNumberAsString() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    String result = fizzBuzz.from(14);

    assertThat(result)
        .isEqualTo("14");
  }

  @Test
  void fifteenReturnsFizzbuzz() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    String result = fizzBuzz.from(15);

    assertThat(result)
        .isEqualTo("Fizzbuzz");
  }

  @Test
  void sixteenReturnsNumberAsString() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    String result = fizzBuzz.from(16);

    assertThat(result)
        .isEqualTo("16");
  }

  @Test
  void seventeenReturnsNumberAsString() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    String result = fizzBuzz.from(17);

    assertThat(result)
        .isEqualTo("17");
  }

  @Test
  void eighteenReturnsFizz() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    String result = fizzBuzz.from(18);

    assertThat(result)
        .isEqualTo("Fizz");
  }

  @Test
  void nineteenReturnsNumberAsString() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    String result = fizzBuzz.from(19);

    assertThat(result)
        .isEqualTo("19");
  }

  @Test
  void twentyReturnsFizz() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    String result = fizzBuzz.from(20);

    assertThat(result)
        .isEqualTo("buzz");
  }
}
