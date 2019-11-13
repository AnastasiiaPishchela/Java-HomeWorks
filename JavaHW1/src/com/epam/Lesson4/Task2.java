package com.epam.Lesson4;

/*
Задача 2 – Создание третьего массива известной длины: Напишите программу на языке Java,
которая создает два массива одинаковой размерности, а затем создает третий такой же размерности и
 заполняет его попарной суммой элементов из первых двух.
 */

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array1 = createArray1();
        System.out.println(Arrays.toString(array1));
        int[] array2 = createArray2();
        System.out.println(Arrays.toString(array2));

        int[] array3 = createArray3(array1, array2);
        System.out.println(Arrays.toString(array3));
    }

    public static int[] createArray1() {
        Random random1 = new Random();
        int[] array1 = new int[7];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random1.nextInt(30 - 10);
        }
        return array1;
    }

    public static int[] createArray2() {
        Random random2 = new Random();
        int[] array2 = new int[7];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = random2.nextInt(30 - 10);
        }
        return array2;
    }

    public static int[] createArray3(int[] array1, int[] array2) {
        int[] array3 = new int[7]; int k=0,j=0;

        for (int i = 0; i <= array1.length-1; i++){
                array3[k] = array1[i] + array2[j];
                k++; j++;
            }

        return array3;
//        for (int i = 0; i <= array3.length; i++)
//        {
//            array3 = new int [array1.length + array2.length];
//        }
//        System.arraycopy(array1, 0, array3, 0, array1.length);
//        System.arraycopy(array2, 0, array3, array1.length, array2.length);
//        return array3;

    }
}

