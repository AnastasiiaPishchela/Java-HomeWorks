package com.epam.Lesson6;

public class Rectangle extends Shape implements Drawable {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() +
                "width = " + width +
                ", height=" + height;
    }

    @Override
    public double calcArea() {
        return width*height;
    }

    @Override
    public void draw() {
        System.out.printf("%s%s%7.2f%n", this.toString(), "; area = ", this.calcArea());
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Rectangle) {
            return (int)(this.calcArea() - ((Rectangle)o).calcArea());
        }
        return 0;
    }
}
