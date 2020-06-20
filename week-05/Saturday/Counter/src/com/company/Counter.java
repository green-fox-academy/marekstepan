package com.company;

public class Counter {
  public int field;
  int defaultValue;

  Counter(int defaultValue){
    this.defaultValue = defaultValue;
    field = defaultValue;
  }

  Counter(){
    
  }

  public void add() {
    field = field +1;
  }

  public void add(int number) {
    field = field + number;
  }
  public int get() {
    return field;
  }

  public void reset() {
    field = defaultValue;
  }
}

/*
Create Counter class
which has an integer field value
when creating it should have a default value 0 or we can specify it when creating
we can add(number) to this counter another whole number
or we can add() without parameters just increasing the counter's value by one
and we can get() the current value
also we can reset() the value to the initial value
 */