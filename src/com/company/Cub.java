package com.company;

public class Cub extends Shapes{
    private int a, b, c, d, e, f;
    private int h, g, i, j, k, l;

    public Cub (int a, int b, int c, int d, int e, int f, int h, int g, int i, int j, int k, int l){
        this.a = a; this.b = b; this.c = c;
        this.h = h; this.e = e; this.f = f;
        this.d = d; this.g = g; this.i = i;
        this.j = j; this.k = k; this.l = l;
    }
    @Override
    public double getPerimetr(){
        return a + b + c + d + e + f + h + g + i + j + k + l;
    }
}