package com.greenfox.restexercises.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Appenda {
  public String word;
  public String appended;

  public Appenda() {
  }

  public Appenda(String word) {
    this.word = word;
    this.appended = word.concat("a");
  }

  @JsonIgnore
  public String getWord() {
    return word;
  }

  public void setWord(String word) {
    this.word = word;
  }

  public String getWorda() {
    return appended;
  }

  public void setWorda(String worda) {
    this.appended = worda;
  }
}
