package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Anna_S
 * <p>
 * Данный код включает в себя Задание N2 и N3
 */

class Calculator {


  public static void main(String[] args) {

    System.out.print("Введите число в зависимости от действия, которое необходимо совершить:\n 1 - посчитать в калькуляторе\n 2 - найти max элемент массива ");
    Scanner scanner = new Scanner(System.in);
    byte a = scanner.nextByte();
    if (a == 1) {
      Calculate();
    } else if (a == 2) {
      System.out.println("Введите кол-во элементов массива");
      int lengthArray = scanner.nextInt();
      maxArrayElement(lengthArray);
    } else {
      System.out.println("Введено некорректное значение");
    }

  }

  public static void Calculate() {

    double num1;
    double num2;
    double operation;
    char op;

    /**Создаем объект сканера и указываем для него источник данных
     * ввод дробных чисел осуществляется через запятую */
    Scanner calc = new Scanner(System.in);
    System.out.print("Введите два числа через пробел без запятых : ");
    num1 = calc.nextDouble();
    num2 = calc.nextDouble();
    System.out.printf("Выберете нужную математическую операцию ( +, -, *, / ): ");
    op = calc.next().charAt(0);
    switch (op) {
      case '+':
        operation = num1 + num2;
        break;
      case '-':
        operation = num1 - num2;
        break;
      case '*':
        operation = num1 * num2;
        break;
      case '/':
        operation = num1 / num2;
        break;
      default:
        System.err.println("Ошибка! Введите два числа еще раз");
        return;
    }

/** Создадим класс DecimalFormat  для форматирования любого числа в Java, будь то целое число или число с плавающей запятой.*/
    DecimalFormat decimalFormat = new DecimalFormat("#.####");
    String secondStr = decimalFormat.format(operation);
    System.out.println(("Результат : \n" + num1 + " " + op + " " + num2 + " = " + secondStr));
  }

  public static String maxArrayElement(int lengthArray) {
    int max, j = 0;
    String[] myArray = new String[lengthArray];
    for (int i = 0; i < lengthArray; i++) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Введите элемент массива");
      myArray[i] = scanner.nextLine();
    }
    for (int i = 0; i < lengthArray; i++) {
      max = myArray[0].length();
      if (myArray[i].length() > max) {
        max = myArray[i].length();
      }
      j = i;

    }
    return String.valueOf(System.out.printf("Max элемент массива %s%n", myArray[j]));
  }
}