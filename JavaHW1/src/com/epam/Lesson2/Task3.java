package com.epam.Lesson2;

public class Task3 {
    public static void main(String[] args) {
        int line = 1;
        int lineCount = 8;
        while (line <= lineCount) {
            int digit = line;
            int spaceCount = lineCount - line;
            while (spaceCount > 0) {
                System.out.print("  ");
                spaceCount--;
            }
            while (digit > 0) {
                System.out.print("+ ");
                digit--;
            }
            System.out.println();
            line++;
        }
    }
}