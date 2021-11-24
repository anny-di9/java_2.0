package com.company;

public class Task_4_1_fixed {

  public static void main(String[] args) {

    int num = 20;
    int a = -10; // a-начальное значение
    int b = 10; // b-конечное значение

    int mas[] = new int[num];
    for (int i = 0; i < num; i++) {
      mas[i] = (int) (Math.random() * (20 + 1)) - 10;
    }
    System.out.println("Массив до изменений:");
    for (int j = 0; j < num; j++) {
      System.out.println(j + " элемент = " + mas[j]);
    }

    int maxNeg = 0;
    int maxNegNum = 0;
    int minPosit = 11;
    int minPositNum = 0;

    for (int z = 0; z < num; z++) {
      if (mas[z] < 0 && maxNeg > mas[z]) {
        maxNeg = mas[z];
        maxNegNum = z;
      }
      if (mas[z] > 0 && minPosit > mas[z]) {
        minPosit = mas[z];
        minPositNum = z;
      }
    }

    if (maxNeg == 0) {
      System.out.println("Отрицательных значений нет");
    } else {
      System.out.println("MАХ отрицательный элемент =" + maxNeg);
    }
    if (minPosit == 11) {
      System.out.println("Положительных значений нет");
    } else {
      System.out.println("MIN положительный элемент =" + minPosit);
    }

    int o = mas[maxNegNum];
    mas[maxNegNum] = mas[minPositNum];
    mas[minPositNum] = o;

    System.out.println("\nМассив после замены элементов:");
    for (int j = 0; j < num; j++) {
      System.out.println(j + " элемент = " + mas[j]);
    }
  }
}
