package com.company;

public class Swop {
    int temp;
    int a, b;

    Swop(int i, int j) {
        a = i;
        b = j;
    }

    public static void main(String[] args) {
        Swop svop = new Swop(5, 7);
        System.out.println("Before svop : " + svop.a + " " + svop.b);
        svop.swopMeth(svop);
        System.out.println("After svop : " + svop.a + " " + svop.b);
    }

    void swopMeth(int a, int b) {
        System.out.println("in method before svop " + a + " " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("in method after svop " + a + " " + b);
    }

    //    void swopMeth(Swop sv){
//       temp = sv.a;
//       sv.a = sv.b;
//       sv.b = temp;
//    }
    void swopMeth(Swop ob) {
        ob.a = ob.a + ob.b;
        ob.b = ob.a - ob.b;
        ob.a = ob.a - ob.b;
    }
}
