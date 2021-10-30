package com.company;

import java.util.Scanner;

public class Task_3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Объявляем Scanner
    System.out.println("Ввод размера массива: ");
    int size = sc.nextInt();
    String massive[] = new String[size];

    System.out.println("Ввод слов:");
    for (int i = 0; i <= massive.length; i++) {
      massive[i] = sc.nextLine(); // Заполняем массив элементами, введёнными с клавиатуры
    }
    System.out.print("Вы ввели:");
    for (int i = 0; i < massive.length; i++) {
      System.out.print(" " + massive[i]);
    }
    System.out.println();
  }
}
