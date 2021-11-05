package com.company;

public class Candies {

  double weight;
  int price;
  String name;
  String info;

  public Candies(String name, int price, double weight, String info) {

    this.name = name;
    this.price = price;
    this.weight = weight;
    this.info = info;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getInfo() {
    return info;
  }

  public void setInfo(String info) {
    this.info = info;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }
}