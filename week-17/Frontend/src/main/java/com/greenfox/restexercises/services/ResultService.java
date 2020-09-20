package com.greenfox.restexercises.services;

import com.greenfox.restexercises.models.Result;
import org.springframework.stereotype.Service;

@Service
public class ResultService {

  public Result countUntil(int until, String action) {
    int number = 0;
    if (action.equals("sum")) {
      number = 0;
      for (int i = 0; i <= until; i++) {
        number = number + i;
      }
    } else if (action.equals("factor")) {
      number = 1;
      for (int i = 1; i <= until; i++) {
        number = number * i;
      }
    }
    return new Result(number);
  }
}
