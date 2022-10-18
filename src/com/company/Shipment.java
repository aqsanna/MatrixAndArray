package com.company;

public class Shipment  extends SubBox{
    double cost;

    Shipment(Shipment ob){
        super(ob);
        cost=ob.cost;
    }
    Shipment(double w, double h, double d, double m, double c){
        super(w, h, d, m);
        cost =c;
    }
    Shipment(){
        super();
        cost=-1;
        System.out.println("Inside Shipment's constructor");
    }
    Shipment(double len, double m, double c){
        super(len, m);
        cost =c;
    }
    void callme(){
        System.out.println("Inside Shipment's callme method");
    }

    public static void main(String[] args) {
        Shipment shipment = new Shipment();
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.076, 1.28);
        double vol;

        vol=shipment1.volume();
        System.out.println("Volume is shippment1 is:" + vol);
        System.out.println("Weight is shippment1 is:" + shipment1.weight);
        System.out.println("Cost is shippment1 is:" + shipment1.cost);
        System.out.println();

        vol=shipment2.volume();
        System.out.println("Volume is shippment2 is:" + vol);
        System.out.println("Weight is shippment2 is:" + shipment2.weight);
        System.out.println("Cost is shippment2 is:" + shipment2.cost);

        System.out.println();
        Box box1= new Box();
        SubBox subBox1 = new SubBox();
        Shipment shipment3 = new Shipment();
        Box r;
        r=box1;
        r.callme();
        r=subBox1;
        r.callme();
        r=shipment3;
        r.callme();
    }
}
