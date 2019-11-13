package com.epam.Lesson6;

public class Triangle extends Shape implements Drawable {
    private double a;
    private double b;
    private double c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return super.toString() +
                "a=" + a +
                ", b=" + b +
                ", c=" + c;
    }

    @Override
    public double calcArea() {
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
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
