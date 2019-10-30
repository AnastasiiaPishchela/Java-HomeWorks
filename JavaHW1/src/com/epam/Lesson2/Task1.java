package com.epam.Lesson2;

/* Задание: Напишите программу на языке Java, которая заполняет звездочками (*)
 и отображает в консоли треугольники, изображенные на рисунке:
 */

public class Task1 {
    public static void main(String[] args) {
        int line = 1;
        while (line <= 8) {
            int digit = line;
            while (digit > 0) {
                System.out.print("* ");
                digit--;
            }
            System.out.println();
            line++;
            if (line == 9) {
                System.out.println("- - - - - - - - -");
            }
        }
        int line2 = 7;
        while (line2 >= 0) {
            int digit2 = line2;
            while (digit2 >=0 ) {
                System.out.print("* ");
                digit2--;
            }
            System.out.println();
            line2--;
        }
    }
}
