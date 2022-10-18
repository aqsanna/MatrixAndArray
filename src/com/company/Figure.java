package com.company;

public abstract class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b){
        dim1=a;
        dim2=b;
    }
   abstract double area();

    public static void main(String[] args) {

        Rectaпgle rectaпgle = new Rectaпgle(9,5);
        Triangle triangle = new Triangle(10, 8);
        Figure figureRef;
        figureRef = rectaпgle;
        System.out.println("Area is: " + figureRef.area());
        figureRef = triangle;
        System.out.println("Area is: " + figureRef.area());

    }
}
