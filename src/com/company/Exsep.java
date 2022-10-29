package com.company;

public class Exsep {

    static void subroutin() {
        try {
            int d = 0;
            int a = 10 / d;
            System.out.println("This will not be print");
        } catch (ArithmeticException e) {
            System.out.println("Dived by zero");
        }
        System.out.println("After catch statement");
    }


    public static void main(String[] args) {
        Exsep.subroutin();
//        try {
//            int а = args.length;
//            int Ь = 42 / а;
//            System.out.println(" a " + а);
//            try {
//                if (a==1){
//                    а = а / (а - а);
//                }
//                if (а == 2) {
//                    int с[] = {1};
//                    с[42] = 99;
//                }
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println(" Индeкc за пределами массива : " + е);
//
//            }
//        } catch (ArithmeticException е) {
//            System.out.println(" Дeлeниe на нуль : " + е);
//        }
//    }
    }
}