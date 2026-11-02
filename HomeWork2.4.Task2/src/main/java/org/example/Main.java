package org.example;

public class Main  {
    public static void main(String[] args) {
        Circle circle = new Circle(3, "red", "black");
        circle.printInfo();
        Rectangle rectangle = new Rectangle(2,3,"red","black");
        rectangle.printInfo();
        Triangle triangle = new Triangle(3,3,3,"yellow", "orange");
        triangle.printInfo();
    }
}
