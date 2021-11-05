package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Task_4_2 {

  public static void main(String[] args) {

    ArrayList<String> MyArrayList = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    double totalPrice = 0;
    double totalWeight = 0;
    boolean endChoice = false;

    System.out.println("Чтобы сформировать подарок, введите одно или несколько чисел через пробел и нажмите Enter ");
    System.out.println("<'1' - \"Dumle\"");
    System.out.println("<'2' - \"Мишка на Севере\"");
    System.out.println("<'3' - \"Птичье молоко\"");
    System.out.println("<'4' - закончить выбор");
    while (!endChoice) {
      int x = in.nextInt();
      switch (x) {
        case 1:
          Candies Dumle = new Candies("Dumle", 200, 0.35, "Карамель");
          String name1 = Dumle.getName();
          MyArrayList.add(name1);
          totalPrice = totalPrice + Dumle.getPrice();
          totalWeight = totalWeight + Dumle.getWeight();
          System.out.println("Конфеты \"Dumle\" добавлены в корзину");
          break;
        case 2:
          Candies Mishka = new Candies("Мишка на Севере", 255, 0.25, "Сливочное пралине");
          String name2 = Mishka.getName();
          MyArrayList.add(name2);
          totalPrice = totalPrice + Mishka.getPrice();
          totalWeight = totalWeight + Mishka.getWeight();
          System.out.println("Конфеты \"Мишка на Севере\" добавлены в корзину");
          break;
        case 3:
          Candies Bird = new Candies("Птичье молоко", 350, 300, "Молочное суфле");
          String name3 = Bird.getName();
          MyArrayList.add(name3);
          totalPrice = totalPrice + Bird.getPrice();
          totalWeight = totalWeight + Bird.getWeight();
          System.out.println("Леденцы \"Птичье молоко\" добавлены в корзину");
          break;
        case 4:
          endChoice = true;
          in.close();
          break;
      }
      int numDumle = 0;
      int numMishka = 0;
      int numBird = 0;
      for (int i = 0; i < MyArrayList.size(); i++) {
        String name = MyArrayList.get(i);
        if (name.equals("Dumle")) {
          numDumle = numDumle + 1;
        } else if (name.equals("Мишка на Севере")) {
          numMishka = numMishka + 1;
        } else if (name.equals("Птичье молоко")) {
          numBird = numBird + 1;
        }
        System.out.println("Подарочный набор состоит из :");
        System.out.println("Конфеты Dumle: " + numDumle + " шт.");
        System.out.println("Конфеты Мишка на Севере: " + numMishka + " шт.");
        System.out.println("Конфеты Птичье молоко: " + numBird + " шт.");
        System.out.println(String.format("\nОбщий вес подарка: %s гр.\nОбщая цена подарка: %s руб.", totalWeight, totalPrice));

      }
    }
  }
}