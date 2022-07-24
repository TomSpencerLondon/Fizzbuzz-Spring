package com.tomspencerlondon.longpolling.hexagon.domain;

public class FizzBuzz {
  private String result;

  public void next(int number) {
    if (number == 0) {
      result = Integer.toString(number);
      return;
    }

    result = parse(number);
  }

  private String parse(int number) {
    if (number % 5 == 0 && number % 3 == 0) {
      return "Fizzbuzz";
    } else if (number % 5 == 0) {
      return "buzz";
    } else if (number % 3 == 0) {
      return "Fizz";
    } else {
      return Integer.toString(number);
    }
  }

  public String result() {
    return result;
  }
}
