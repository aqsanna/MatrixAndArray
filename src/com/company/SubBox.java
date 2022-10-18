package com.company;

public class SubBox extends Box {


    double weight;

    SubBox(SubBox ob){
        super(ob);
        weight = ob.weight;
    }

    SubBox(double w, double h, double d, double m){
        super(w,h, d);
        weight = m;
    }
    SubBox(){
        super();
        weight=-1;
        System.out.println("Inside SubBox's constructor");
    }
    SubBox(double len, double m){
        super(len);
        weight=m;
    }
    void printSubBox() {
        System.out.println("This is a subClass");
    }
    void callme(){
        System.out.println("Inside SubBox's callme method");
    }


    public static void main(String[] args) {
        Box box = new Box();
        SubBox mysubbox1 = new SubBox(10, 15, 16, 20.25);
        SubBox mysubbox2 = new SubBox(2, 3, 4, 0.075);
        double vol;
        vol = mysubbox1.volume();
        System.out.println("Volume of mysubbox1 is:" + vol);
        System.out.println("Weight of mysubbox1 is:" + mysubbox1.weight);
        System.out.println();
        vol = mysubbox2.volume();
        System.out.println("Volume of mysubbox2 is:" + vol);
        System.out.println("Weight of mysubbox2 is:" + mysubbox2.weight);
        System.out.println();
        SubBox subBox = new SubBox();
        box=subBox;
        System.out.println(box.volume());
        Box plainBox = new Box();
        plainBox = mysubbox1;
        vol = plainBox.volume();
        System.out.println("Volume of plainbox is:" + vol);
        //System.out.println("Weight of plainBox is:" + plainBox.weight);

        System.out.println();
        SubBox mybox1 = new SubBox(10, 20, 15, 34.3);
        SubBox mybox2 = new SubBox(2, 3, 4, 0.076);
        SubBox mybox3 = new SubBox();
        SubBox mycube = new SubBox(3,2);
        SubBox myclone = new SubBox(mybox1);
        vol=mybox1.volume();
        System.out.println("Volume of mybox1 is:" + vol);
        System.out.println("Weight of mybox1 is:" + mybox1.weight);
        System.out.println();

        vol=mybox2.volume();
        System.out.println("Volume of mybox2 is:" + vol);
        System.out.println("Weight of mybox2 is:" + mybox2.weight);
        System.out.println();

        vol=mybox3.volume();
        System.out.println("Volume of mybox3 is:" + vol);
        System.out.println("Weight of mybox3 is:" + mybox3.weight);
        System.out.println();

        vol=mycube.volume();
        System.out.println("Volume of mycube is:" + vol);
        System.out.println("Weight of mycube is:" + mycube.weight);
        System.out.println();

        vol=myclone.volume();
        System.out.println("Volume of myclone is:" + vol);
        System.out.println("Weight of myclone is:" + myclone.weight);
        System.out.println();





    }

}
