package com.company;

public class Triangle extends Shapes {
    private int a, b, c;

    public Triangle (int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimetr() {
        return a + b + c;
    }
}
