package com.tomspencerlondon.longpolling.domain;

public class FizzBuzz {

  public String from(int number) {
    String result = "";
    if (number == 0) {
      return result;
    }

    if (number % 5 == 0 && number % 3 == 0) {
      result += "Fizzbuzz";
    } else if (number % 5 == 0) {
      result += "buzz";
    } else if (number % 3 == 0) {
      result += "Fizz";
    } else {
      result += number;
    }

    return result;
  }
}
