package com.tomspencerlondon.longpolling.domain;

public class FizzBuzz {

  public String from(int number) {
    String result = "";
    if (number == 0) {
      return result;
    }

    Result output = Result.from(number);
    return output == Result.NUMBER ? "" + number : output.getResult();
  }
}
