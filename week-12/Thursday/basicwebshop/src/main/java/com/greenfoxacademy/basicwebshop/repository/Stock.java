package com.greenfoxacademy.basicwebshop.repository;

import com.greenfoxacademy.basicwebshop.models.ShopItem;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stock {
  private List<ShopItem> stock;

  public Stock(){
    this.stock = new ArrayList<>();
    stock.add(new ShopItem("Apricot Marmalade", "300 ml of absolute o", 85.00, 25));
    stock.add(new ShopItem("Sun Dried Figs", "10 pcs, no artificial heat used", 70.00, 153));
    stock.add(new ShopItem("Chicken", "1 pc. Plus extra gift: Handbook How to kill a chicken", 500.00,0));
    stock.add(new ShopItem("Pear Vinegar", "250 ml. Aged for 7 years", 99.00,58));
    stock.add(new ShopItem("Freeze Dried Arctic Kiwis", "20 pcs.", 60.00,821));
    stock.add(new ShopItem("Green Wallnut Preserves", "10 pcs in a bottle", 120.00,301));
    stock.add(new ShopItem("Spruce & Honey & Lemon Liqueur", "500 ml", 200.00,50));
    stock.add(new ShopItem("Pine & Honey & Lemon Liqueur", "500 ml", 200.00,0));
  }

  public List<ShopItem> getStock() {
    return stock;
  }

  public void setStock(List<ShopItem> stock) {
    this.stock = stock;
  }

  public void addShopItem(ShopItem shopItem){
    this.stock.add(shopItem);
  }

  public List filterAvailable (){
    return stock.stream()
        .filter(shopItem -> shopItem.getStockQuantity() > 0)
        .collect(Collectors.toList());
  }

  public List cheapestFirst (){
    return stock.stream()
        .sorted(Comparator.comparingDouble(ShopItem::getPrice))
        .collect(Collectors.toList());
  }

  public List filterDried (){
    return stock.stream()
        .filter(item -> item.getName().contains("Dried") || item.getDescription().contains("Dried"))
        .collect(Collectors.toList());
  }

  public Double averageStock (){
    return stock.stream()
        .mapToDouble(ShopItem::getStockQuantity)
        .average()
        .getAsDouble();
  }

  public String mostExpensive (){
    List<ShopItem> sortedItems = stock.stream()
        .filter(shopItem -> shopItem.getStockQuantity() > 0)
        .sorted(Comparator.comparingDouble(ShopItem::getPrice))
        .collect(Collectors.toList());
    return sortedItems.get(sortedItems.size()-1).getName();

  }

  public List<ShopItem> containsSearched(String name) {
    return stock.stream()
        .filter(ShopItem -> ShopItem.getName().contains(name) || ShopItem.getDescription().contains(name))
        .collect(Collectors.toList());
  }

}
