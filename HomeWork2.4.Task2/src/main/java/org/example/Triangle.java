package org.example;

public class Triangle implements TriangleAction {
    private int a;
    private int b;
    private int c;
    private String fillColor;
    private String borderColor;

    public Triangle(int a, int  b, int c, String fillColor, String borderColor) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double triangleSquare(int a, int b) {
        return (a * b) * half;
    }

    public double getSquare() {
        return triangleSquare(a,b);
    }

    public double getPerimeter() {
        return trianglePer(a,b,c);
    }

    public void printInfo() {
        System.out.println("Треугольник -> [Периметр: " + getPerimeter() +
                ", Площадь: " + getSquare() +
                ", Цвет фона: " + fillColor +
                ", Цвет границ: " + borderColor + "]");
    }
}