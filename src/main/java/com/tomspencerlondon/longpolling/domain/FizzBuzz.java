package com.tomspencerlondon.longpolling.domain;

public class FizzBuzz {

  public String from(int number) {
    if (number == 0) {
      return "";
    }

    if (number == 3) {
      return "Fizz";
    }

    return "" + number;
  }
}
