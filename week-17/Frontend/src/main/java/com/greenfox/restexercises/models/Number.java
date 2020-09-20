package com.greenfox.restexercises.models;

public class Number {
  private long received;
  private long result;

  public Number() {
  }

  public Number(long received) {
    this.received = received;
    this.result = received*2;
  }

  public long getReceived() {
    return received;
  }

  public void setReceived(long received) {
    this.received = received;
  }

  public long getResult() {
    return result;
  }

  public void setResult(long result) {
    this.result = result;
  }
}
