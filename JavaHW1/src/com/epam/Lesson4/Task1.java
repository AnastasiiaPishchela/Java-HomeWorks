package com.epam.Lesson4;
import java.util.Arrays;
import java.util.Random;

/*
Задача 1 - Обработка без ветвлений:
Напишите программу на языке Java, которая создает массив любого типа, а
затем выводит его в консоль в прямом и обратном порядках.
 */

public class Task1 {
    public static void main(String[] args) {
        int[] array = createArray();
        System.out.println(Arrays.toString(array));
        int[] reverseArray = reversedArray(array);
        System.out.println(Arrays.toString(reverseArray));

    }

    public static int[] createArray() {
        Random random = new Random();
        int[] array = new int[7];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(30 - 10);
        }
        return array;
    }

    private static int[] reversedArray(int[] array) {
            int[] reverseArray = array;
            int maxIndex = array.length - 1;
            for (int i = 0; i <= maxIndex / 2; i++) {
                int z = reverseArray[i];
                reverseArray[i] = reverseArray[maxIndex - i];
                reverseArray[maxIndex - i] = z;
            }
            return reverseArray;
        }
    }


