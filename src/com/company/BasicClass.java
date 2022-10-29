package com.company;

public  class BasicClass {
    int i;
    int j;
    BasicClass(){
        System.out.println("Default constructor");
    }
    BasicClass(int a, int b){
        i=a;
        j=b;
    }

    void showij(){
        System.out.println("i and j:" + i +" " + j);
    }
    void setij(int x, int y){
        i=x;
        j=y;

    }
    protected final void foo(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        BasicClass basicClass = new BasicClass();
        SubClass subClass = new SubClass();
        subClass.foo();
//        basicClass.i=10;
//        basicClass.j=20;
//        System.out.println("Contents of basicClass");
//        basicClass.showij();
//        System.out.println();
//        subClass.i=7;
//       //subClass.j=8;
//        subClass.k=10;
//        System.out.println("Contents of subClass");
//        subClass.showij();
//        subClass.showk();
//        System.out.println();
//        System.out.println("Sum of i, j and k in subClass");
//        subClass.sum();
//        subClass.setij(10,20);
//        subClass.sum();
//        System.out.println("Sum is:" + subClass.total);
//        System.out.println();
//        SubClass subObj = new SubClass(1, 2, 3);
//        subObj.showij();
//        subObj.showij("This is a :");
    }

}
