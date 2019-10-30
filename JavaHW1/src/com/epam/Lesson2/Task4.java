package com.epam.Lesson2;

public class Task4<lineCount2> {
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
        if (line == 9) {
            System.out.println("---------------");
        }

        int line2 = 0;
        int lineCount2 = 8;
        while (line2 <= lineCount2) {
            int digit2 = line2;
            int spaceCount2 = lineCount2 - line2;
            while (digit2 > 0) {
                System.out.print("  ");
                digit2--;
            }
            while (spaceCount2 > 0) {
                System.out.print("+ ");
                spaceCount2--;
            }
            System.out.println();
            line2++;
        }
    }
}
