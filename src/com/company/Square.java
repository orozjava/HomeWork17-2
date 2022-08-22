package com.company;

public class Square extends Shapes {
    private int a, b;
    private int c, d;

    public Square (int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    @Override
    public double getPerimetr(){
        return a + b + c + d;
    }
}
