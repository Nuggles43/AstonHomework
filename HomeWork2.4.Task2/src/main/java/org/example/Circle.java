package org.example;

public class Circle implements CircleAction {
    private int radius;
    private String fillColor;
    private String borderColor;

    public Circle(int radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @Override
    public double circleSquare(int r) {
        return (r * r) * PI;
    }

    public double getSquare() {
        return circleSquare(radius);
    }

    public double getPerimeter() {
        return circlePer(radius);
    }

    public void printInfo() {
        System.out.println("Круг -> [Периметр: " + getPerimeter() +
                ", Площадь: " + getSquare() +
                ", Цвет фона: " + fillColor +
                ", Цвет границ: " + borderColor + "]");
    }
}