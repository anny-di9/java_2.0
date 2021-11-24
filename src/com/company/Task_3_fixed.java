package com.company;

import java.util.Scanner;

public class Task_3_fixed {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Выберите программу: 1 - калькулятор, 2 - поиск максимального слова в массиве");
    int action = sc.nextInt();
    switch (action) {
      case 1:
        System.out.println("Выберите операцию: 1 - сложение, 2 - вычитание, 3 - умножение, 4 - деление");
        int operation = sc.nextInt();
        switch (operation) {
          case 1:
            System.out.println("Введите первое число:");
            Scanner sc2 = new Scanner(System.in);
            double per1 = sc2.nextDouble();
            System.out.println("Введите второе число:");
            Scanner sc3 = new Scanner(System.in);
            double per2 = sc3.nextDouble();
            double result = per1 + per2;
            System.out.printf("Результат = " + "%.4f", result);
            break;
          case 2:
            System.out.println("Введите первое число:");
            Scanner sc4 = new Scanner(System.in);
            per1 = sc4.nextDouble();
            System.out.println("Введите второе число:");
            Scanner sc5 = new Scanner(System.in);
            per2 = sc5.nextDouble();
            result = per1 - per2;
            System.out.printf("Результат = " + "%.4f", result);
            break;
          case 3:
            System.out.println("Введите первое число:");
            Scanner sc6 = new Scanner(System.in);
            per1 = sc6.nextDouble();
            System.out.println("Введите второе число:");
            Scanner sc7 = new Scanner(System.in);
            per2 = sc7.nextDouble();
            result = per1 * per2;
            System.out.printf("Результат = " + "%.4f", result);
            break;
          case 4:
            System.out.println("Введите первое число:");
            Scanner sc8 = new Scanner(System.in);
            per1 = sc8.nextDouble();
            System.out.println("Введите второе число:");
            Scanner sc9 = new Scanner(System.in);
            per2 = sc9.nextDouble();
            result = per1 / per2;
            System.out.printf("Результат = " + "%.4f", result);
            break;
        }
        break;
      case 2:
        Scanner scanner10 = new Scanner(System.in);
        System.out.println("Введите длину массива слов");
        int length_mass = scanner10.nextInt();
        String myArray[] = new String[length_mass];
        System.out.println("Введите элементы массива:"); //после ввода каждого значения нажать Enter
        for (int i = 0; i < length_mass; i++) {
          myArray[i] = sc.next();
        }
        String max_string = null;
        int max_count = 0;
        System.out.print("Элементы массива:");
        for (int i = 0; i < length_mass; i++) {
          System.out.print(" " + myArray[i] + " ");
          int count = 0;
          for (int s = 0; s < myArray[i].length(); s++) {
            count++;
            if (count >= max_count) {
              max_count = count;
              max_string = myArray[i];
            }
          }
        }
        System.out.print("\n" + "самое длинное слово в массиве:  " + max_string);
        break;
    }
    sc.close();
  }
}
