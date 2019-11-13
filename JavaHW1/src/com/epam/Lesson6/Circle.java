package com.epam.Lesson6;

public class Circle extends Shape implements Drawable {
    private double radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() +
                "radius=" + radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.printf("%s%s%7.2f%n", this.toString(), "; area = ", this.calcArea());
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Shape) {
            return (int)(this.calcArea() - ((Shape) o).calcArea());
        }
        return 0;
    }
}
