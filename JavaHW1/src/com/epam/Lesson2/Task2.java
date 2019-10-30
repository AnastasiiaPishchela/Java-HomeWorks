package com.epam.Lesson2;

public class Task2 {
    public static void main(String[] args) {
        int line = 1;
        while (line <= 8) {
            int digit = line;
            while (digit <=8 ) {
                System.out.print("* ");
                digit++;
            }
            System.out.println();
            line++;
        }
    }
}
