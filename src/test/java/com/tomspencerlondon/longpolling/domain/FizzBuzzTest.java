package com.tomspencerlondon.longpolling.domain;

import static org.assertj.core.api.Assertions.assertThat;

import com.tomspencerlondon.longpolling.hexagon.domain.FizzBuzz;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

  @Test
  void zeroReturnsEmptyString() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    fizzBuzz.next(0);

    assertThat(fizzBuzz.result())
        .isEqualTo("0");
  }

  @Test
  void oneReturnsNumberAsString() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    fizzBuzz.next(1);

    assertThat(fizzBuzz.result())
        .isEqualTo("1");
  }

  @Test
  void twoReturnsNumberAsString() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    fizzBuzz.next(2);

    assertThat(fizzBuzz.result())
        .isEqualTo("2");
  }

  @Test
  void threeReturnsFizz() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    fizzBuzz.next(3);

    assertThat(fizzBuzz.result())
        .isEqualTo("Fizz");
  }

  @Test
  void fourReturnsNumberAsString() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    fizzBuzz.next(4);

    assertThat(fizzBuzz.result())
        .isEqualTo("4");
  }

  @Test
  void fiveReturnsFizzBuzz() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    fizzBuzz.next(5);

    assertThat(fizzBuzz.result())
        .isEqualTo("buzz");
  }

  @Test
  void sixReturnsFizz() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    fizzBuzz.next(6);

    assertThat(fizzBuzz.result())
        .isEqualTo("Fizz");
  }

  @Test
  void sevenReturnsNumberAsString() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    fizzBuzz.next(7);

    assertThat(fizzBuzz.result())
        .isEqualTo("7");
  }

  @Test
  void eightReturnsNumberAsString() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    fizzBuzz.next(8);

    assertThat(fizzBuzz.result())
        .isEqualTo("8");
  }

  @Test
  void nineReturnsFizz() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    fizzBuzz.next(9);

    assertThat(fizzBuzz.result())
        .isEqualTo("Fizz");
  }

  @Test
  void tenReturnsFizzbuzz() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    fizzBuzz.next(10);

    assertThat(fizzBuzz.result())
        .isEqualTo("buzz");
  }

  @Test
  void elevenReturnsNumberAsString() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    fizzBuzz.next(11);

    assertThat(fizzBuzz.result())
        .isEqualTo("11");
  }

  @Test
  void twelveReturnsFizz() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    fizzBuzz.next(12);

    assertThat(fizzBuzz.result())
        .isEqualTo("Fizz");
  }

  @Test
  void thirteenReturnsNumberAsString() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    fizzBuzz.next(13);

    assertThat(fizzBuzz.result())
        .isEqualTo("13");
  }

  @Test
  void fourteenReturnsNumberAsString() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    fizzBuzz.next(14);

    assertThat(fizzBuzz.result())
        .isEqualTo("14");
  }

  @Test
  void fifteenReturnsFizzbuzz() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    fizzBuzz.next(15);

    assertThat(fizzBuzz.result())
        .isEqualTo("Fizzbuzz");
  }

  @Test
  void sixteenReturnsNumberAsString() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    fizzBuzz.next(16);

    assertThat(fizzBuzz.result())
        .isEqualTo("16");
  }

  @Test
  void seventeenReturnsNumberAsString() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    fizzBuzz.next(17);

    assertThat(fizzBuzz.result())
        .isEqualTo("17");
  }

  @Test
  void eighteenReturnsFizz() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    fizzBuzz.next(18);

    assertThat(fizzBuzz.result())
        .isEqualTo("Fizz");
  }

  @Test
  void nineteenReturnsNumberAsString() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    fizzBuzz.next(19);

    assertThat(fizzBuzz.result())
        .isEqualTo("19");
  }

  @Test
  void twentyReturnsFizz() {
    FizzBuzz fizzBuzz = new FizzBuzz();

    fizzBuzz.next(20);

    assertThat(fizzBuzz.result())
        .isEqualTo("buzz");
  }
}
