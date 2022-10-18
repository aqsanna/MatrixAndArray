package com.company;

public class Box {
    private double widht;
    private double heigth;
    private double depth;

    Box(double width, double heigth, double depth) {
        this.widht = width;
        this.heigth = heigth;
        this.depth = depth;
    }
    Box(Box ob){
        widht= ob.widht;
        heigth= ob.heigth;
        depth= ob.depth;
    }

    Box() {
        widht = -1;
        heigth = -1;
        depth = -1;
        System.out.println("Inside Box's constructor");
    }

    Box(double len) {
        widht = heigth = depth = len;
    }
    double volume() {
        return widht * heigth * depth;
    }

    void foo() {
        System.out.println(this.volume());
    }

    void setDim(double w, double h, double d) {
        widht = w;
        heigth = h;
        depth = d;

    }
    void callme(){
        System.out.println("Inside Box's callme method");
    }

    public static void main(String[] args) {
        Box box = new Box(10, 20, 15);
        Box box1 = new Box();
        Box box2 = new Box(7);
        double vol;
        vol = box.volume();
        System.out.println("Volume of box is:" + vol);
        vol = box1.volume();
        System.out.println("Volume of box1 is:" + vol);
        vol = box2.volume();
        System.out.println("Volume of box2 is:" + vol);

    }

}
