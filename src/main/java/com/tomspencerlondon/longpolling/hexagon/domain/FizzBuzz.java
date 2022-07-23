package com.tomspencerlondon.longpolling.hexagon.domain;

public class FizzBuzz {
  private Result result;
  private int number;

  public void next(int number) {
    if (number == 0) {
      return;
    }
    result = Result.from(number);
    this.number = number;
  }

  public String result() {
    if (result == null) {
      return "";
    }

    return result.equals(Result.NUMBER) ? "" + number : result.value();
  }
}
