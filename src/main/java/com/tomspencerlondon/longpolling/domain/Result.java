package com.tomspencerlondon.longpolling.domain;

public enum Result {
  FIZZ("Fizz"), BUZZ("buzz"), FIZZBUZZ("Fizzbuzz"), NUMBER(null);

  private final String result;

  Result(String result) {
    this.result = result;
  }

  public String getResult() {
    return result;
  }

  public static Result from(int input) {
    if (input % 5 == 0 && input % 3 == 0) {
      return FIZZBUZZ;
    } else if (input % 5 == 0) {
      return BUZZ;
    } else if (input % 3 == 0) {
      return FIZZ;
    } else {
      return NUMBER;
    }
  }
}
