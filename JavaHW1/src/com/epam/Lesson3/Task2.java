package com.epam.Lesson3;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/*
Задача 2:  Напишите программу на языке Java, которая вводит целое число, преобразует его в двоичное представление,
сохраняя как строку, и выводит в консоль результат. Преобразование  выполняется отдельным методом.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.print("Please, enter a number -> ");
        int number = Integer.parseInt(sc.next());
        String res = convertToBinary(number);
        out.println(res);
        out.println(Integer.toBinaryString(number));
    }

    public static String convertToBinary(int number) {
        String result = "";
        while (number > 0) {
            result = ((number % 2) == 0 ? 0 : 1) + result;
            number = number / 2;
        }
        return result;
    }
}
