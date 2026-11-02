package org.example;

public class Rectangle implements RectangleAction {
    private int a;
    private int b;
    private String fillColor;
    private String borderColor;

    public Rectangle(int a, int  b, String fillColor, String borderColor) {
        this.a = a;
        this.b = b;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public int rectangleSquare(int a, int b) {
        return a * b;
    }

    public int getSquare() {
        return rectangleSquare(a,b);
    }

    public double getPerimeter() {
        return rectanglePer(a,b,a,b);
    }

    public void printInfo() {
        System.out.println("Прямоугольник -> [Периметр: " + getPerimeter() +
                ", Площадь: " + getSquare() +
                ", Цвет фона: " + fillColor +
                ", Цвет границ: " + borderColor + "]");
    }
}