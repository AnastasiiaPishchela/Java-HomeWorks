package com.epam.Lesson3;

/* Задача 1: Напишите программу на языке Java, которая вводит некоторую строку
и выводит в консоль все уникальные символы этой строки. Обработка строки  выполняется отдельным методом.   */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, Enter the word -> ");
        String word = sc.next();
        uniChars(word);
    }

    public static void  uniChars (String word) {
        int index = 0;
        String wordToReturn = "";
        while (index < word.length()) {
            char ch = word.charAt(index);
            if (!wordToReturn.contains(String.valueOf(ch))) {
                wordToReturn += ch;
            }
            index++;
        }
        System.out.print(wordToReturn);
    }
}

