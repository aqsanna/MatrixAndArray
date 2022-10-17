package com.company;

public class SubBox extends Box {

    double m;
    void printSubBox() {
        System.out.println("This is a subClass");
    }


    public static void main(String[] args) {
        Box box = new Box();
        SubBox subBox = new SubBox();
        box=subBox;
        System.out.println(box.volume());



    }

}
