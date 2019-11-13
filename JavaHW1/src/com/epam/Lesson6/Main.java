package com.epam.Lesson6;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = {new Circle ("RED, ", 10),
                new Circle ("White, ", 5),
                new Circle ("Blue, ", 20),
                new Circle ("Green, ", 30),
                new Circle ("Black, ", 180),
                new Circle ("Pink, ", 15),
        };
//        Arrays.sort(shapes);
        Arrays.sort(shapes, new MyComparatorColor());
        System.out.println("Sorted array: ");
        for (Shape element : shapes) {
            element.draw();
        }

        Rectangle[] rectangles = {new Rectangle("Orange, ", 14.5, 78.9),
                new Rectangle("White, ", 14.5, 63.9),
                new Rectangle("Blue, ", 8.5, 4.1),
                new Rectangle("Green, ", 2.75, 14.9),
                new Rectangle("Pink, ", 64.75, 67.9),
                new Rectangle("Grey, ", 30.5, 42.9)};
    Arrays.sort(rectangles, new MyComparatorColor());
        System.out.println("Sorted array rectangle: ");
        for (Rectangle element : rectangles) {
            element.draw();
        }
        Triangle[] triangles = {new Triangle("Green, ",10,20,30),
                new Triangle("Grey, ",20,40,7),
                new Triangle("Black, ", 14, 9, 6),
                new Triangle("Blue, ", 10, 27, 34),
                new Triangle("Pink, ", 18, 26, 35),
                new Triangle("White, ", 16, 22, 37)};
        Arrays.sort(triangles, new MyComparatorColor());
        System.out.println("Sorted array triangle: ");
        for (Triangle element : triangles) {
            element.draw();
        }
     //   System.out.println("Calculated area= " + calcArea);
//вызвать метод
    }

       public double calcArea(Triangle[] triangles, Rectangle[] rectangles, Circle[] circles) {
        return calcArea(triangles,rectangles,circles); };
}


