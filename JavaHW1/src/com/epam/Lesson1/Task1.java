package com.epam.Lesson1;

/* Задача 1:
Напишите программу на языке Java, которая:
− описывает трехзначное целое число number (например, 123);
− находит и выводит в консоль разность между числом number и числом,
составленным из цифр числа number, но взятых в обратном порядке (для
указанного примера обратное число – это 321). */

public class Task1 {
    public static void main(String[] args) {
        int straitNumber = 123;
        int firstDigit = straitNumber/100;
        int secondDigit = (straitNumber - firstDigit*100)/10;
        int thirdDigit = straitNumber - (firstDigit*100 + secondDigit*10);
        int reverseNumber = thirdDigit*100+secondDigit*10+firstDigit;
        System.out.println(straitNumber + " - " + reverseNumber + " = " + (straitNumber - reverseNumber));
        }
}


