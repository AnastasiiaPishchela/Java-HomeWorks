package com.epam.Lesson6;

public abstract class Shape implements Drawable, Comparable{
    private String color;
    public String getColor() {
        return color;
    }

    public Shape(String color) { this.color = color; }

    public abstract double calcArea();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                ": color='" + color;
    }
}