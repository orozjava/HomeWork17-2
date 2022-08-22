package com.company;

public class Main {

    public static void main(String[] args) {
       Square sq = new Square(4, 4, 4, 4);
       System.out.println("Квадраттын периметри: " + sq.getPerimetr());

       Rectangle rec = new Rectangle(11, 6, 8, 5);
       System.out.println("Прямоугольниктин периметри: " + rec.getPerimetr());

       Triangle tr = new Triangle(2, 7, 9);
       System.out.println("Триугольниктин периметри: " + tr.getPerimetr());

       Trapesia tra = new Trapesia(1, 2, 3, 4);
       System.out.println("Трапесиянын периметри: " + tra.getPerimetr());

       Cub cub = new Cub(6, 6, 6, 6, 6, 6, 6, 6, 6, 6,6, 6);
       System.out.println("Кубтун периметри: " + cub.getPerimetr());

    }
}
