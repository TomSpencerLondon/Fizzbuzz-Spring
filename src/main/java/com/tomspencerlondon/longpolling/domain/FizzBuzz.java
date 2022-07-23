package com.tomspencerlondon.longpolling.domain;

public class FizzBuzz {

  public String from(int number) {
    String result = "";

    if (number == 3) {
      result += "Fizz";
    } else if (number > 0) {
      result += number;
    }

    return result;
  }
}
