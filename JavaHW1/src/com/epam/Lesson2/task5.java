package com.epam.Lesson2;

public class task5 {
    public static void main(String[] args) {
        int times = 2;
        while (times >=1) {
            int line = 1;
            int lineCount = 8;
            while (line <= lineCount) {
                int digit = line;
                int spaceCount = lineCount - line;
                while (spaceCount > 0) {
                    System.out.print("  ");
                    spaceCount--;
                }
//            if (line == 1) {
//                System.out.print("|");
//            }
                digit = digit * 2;
                while (digit > 0) {
                    System.out.print("+ ");
                    digit--;
                }
                System.out.println();
                line++;
            }

            if (line == 9) {
                System.out.println("--------------------------------");
            }
            times--;
        }
    }
}