package org.example;

public interface CircleAction {
    double PI = 3.14;
    double circleSquare(int r); // Площадь круга
    default double circlePer(int r) { // Периметр круга
        return 2 * PI * r;
    }
}