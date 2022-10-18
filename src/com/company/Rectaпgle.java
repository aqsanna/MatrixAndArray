package com.company;

public class Rectaпgle extends  Figure {

    Rectaпgle(double a, double b){
        super(a, b);
    }
    double area(){
        System.out.println("Area for rectangle");
        return dim1 * dim2;
    }


}
