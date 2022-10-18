package com.company;

public class SubClass extends BasicClass {
    int k;
    int total;
    SubClass(){
        System.out.println("default constructor for SubClass");
    }
    SubClass(int a, int b, int c){
        super(a, b);
        k =c;
    }
    void showij(){
        super.showij();
        System.out.println("k is:" + k);
    }
    void showij(String msg){
        System.out.println(msg + k);
     }

    void showk(){
        System.out.println("k :" + k);
    }
    void sum(){
      //  System.out.println("i + j + k:" + (i+j+k));
        //total = i+j;
    }

}
