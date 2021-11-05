package com.company;

import java.util.Arrays;

public class Task_4_1 {

  public static void main(String[] args) {

    int[] myArray = new int[20];
    int maxNum = -11;
    int minNum = 11;
    int i_max = 0;
    int i_min = 0;
    for (int i = 0; i < 20; i++) {
      int x = (int) (Math.random() * 20 - 10);
      myArray[i] = x;
      if (maxNum <= myArray[i]) {
        maxNum = myArray[i];
        i_max = i;
      }
      if (minNum >= myArray[i]) {
        minNum = myArray[i];
        i_min = i;
      }
    }
    System.out.println("Произвольный массив:");
    System.out.println(Arrays.toString(myArray));
    System.out.println("Max элемент массива: " + maxNum);
    System.out.println("Min элемент массива: " + minNum);
    myArray[i_max] = minNum;
    myArray[i_min] = maxNum;
    System.out.println("Поменять местами максимальный и минимальный элемент");
    System.out.println(Arrays.toString(myArray));
  }
}

