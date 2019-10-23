package com.epam.Lesson1;

/* Задача 3:
        Напишите программу на языке Java, которая вычисляет и выводит в
        консоль сумму прибыли по заданному депозиту (например, 10000) на заданное
        количество месяцев (например, 6) под указанный процент годовых (например,
        12%). */

public class Task3 {
    public static void main(String[] args) {
        int deposit = 10000;
        int months = 6;
        int percentForYear = 12;

        int percentForMonth = percentForYear/12;

        System.out.println("sumOfProfit: " + (((deposit*percentForMonth/100))*months));
    }
  }
