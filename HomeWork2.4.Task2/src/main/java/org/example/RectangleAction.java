package org.example;

public interface RectangleAction {

    int rectangleSquare(int a, int b);
    default int rectanglePer(int a, int b, int c, int d ) {
        return a + b + c + d;
    }
}