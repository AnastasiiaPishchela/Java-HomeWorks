package com.epam.Lesson4;

/*
Задача 3 – Создание третьего массива неизвестной длины: Напишите программу на языке Java, которая создает массив
любого типа, а затем разделяет его на два: из положительных и отрицательных элементов
 */

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
//        int[] array = createArray();
//        System.out.println(Arrays.toString(array));
        int[] arrayMinus = createArrayMinus();
        System.out.println(Arrays.toString(arrayMinus));
        int[] arrayPlus = createArrayPlus();
        System.out.println(Arrays.toString(arrayPlus));

    }

    //   public static int[] createArray() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter numbers with + and /- -> ");
//        String array = sc.next();


//        Random random = new Random();
//        int [] array = new int [10];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(900 - 100);
//        }
//        return array;
    //   }

    public static int[] createArrayMinus() {
        int[] array = {12, 9, -6, -8, 6, -7, 10, -11, -33};
        int arrayLength = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] < 0) {
                arrayLength++;
            }
        }
        int[] arrayMinus = new int[arrayLength];
        int j = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] < 0) {
                arrayMinus[j] = array[i];
                j++;
            }
        }
        return arrayMinus;
    }

    public static int[] createArrayPlus() {
        int[] array = {12, 9, -6, -8, 6, -7, 10, -11, -33};
        int arrayLength = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] < 0) {
                arrayLength++;
            }
        }
        int[] arrayPlus = new int[arrayLength];
        int j = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] > 0) {
                arrayPlus[j] = array[i];
                j++;
            }
        }
        return arrayPlus;
    }
}