package com.epam.Lesson1;

/* Задача 2:
Напишите программу на языке Java, которая преобразует вес, заданный в
фунтах, в килограммы, но выводит раздельно количество полученных
килограмм и грамм (в 1 фунте 453,6 грамм). */

public class Task2 {
    public static void main(String[] args) {
        int weightPounds = 3;
        double weight3PoundsInGramms = (weightPounds * 453.6);
        double weightInKilos = weight3PoundsInGramms / 1000;
       double weightInGramms = weightInKilos % (int)weightInKilos;

        System.out.println("weight in kilos: " + (int)weightInKilos + " " + "weight in gramms: " + weightInGramms);
    }
}
