package com.greenfoxacademy.basicwebshop.models;

public class ShopItem {
    private String name;
    private String description;
    private double price;
    private int stockQuantity;

  public ShopItem(String name, String description, double price, int stockQuantity) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.stockQuantity = stockQuantity;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getStockQuantity() {
    return stockQuantity;
  }

  public void setStockQuantity(int stockQuantity) {
    this.stockQuantity = stockQuantity;
  }
}
