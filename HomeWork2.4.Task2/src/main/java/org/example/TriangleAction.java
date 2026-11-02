package org.example;

public interface TriangleAction {
    double half = 0.5;
    double triangleSquare(int a, int b);
    default int trianglePer(int a, int b, int c ) {
        return a + b + c ;
    }
}