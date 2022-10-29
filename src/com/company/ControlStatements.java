package com.company;

public class ControlStatements {
    int x;
    int y;
    int z;
    int k;

//    int maxNumber(int x, int y, int z) {
//        // find max number
//        if (x >= y && x >= z) {
//            return x;
//        } else if (y >= x && y >= z) {
//            return y;
//        } else {
//            return z;
//        }
//    }
//
//    int minNumber(int x, int y, int z) {
//        // find min number
//        if (x <= y && x <= z) {
//            return x;
//        } else if (z <= x && z <= y) {
//            return z;
//        }
//        return y;
//    }
//
//    int maxNumberTernory(int x, int y, int z) {
//        // find max for 4 number with ternary operator
//        int maximum = x >= y ? x : y;
//        maximum = maximum >= z ? maximum : z;
//        maximum = maximum >= k ? maximum : k;
//        return maximum;
//    }
//
//    int minNumberTernory(int x, int y, int z) {
//        // find min for 4 number with ternary operator
//
//        int minimum = x <= y ? x : y;
//        minimum = minimum <= z ? minimum : z;
//        minimum = minimum <= k ? minimum : k;
//        return minimum;
//    }
//
//    boolean tringle(int x, int y, int z) {
//        // triangle
//        return x + y > z && x + z > y && y + z > x;
//    }
//
//    int switchCase(int day) {
//
//        //  weekday
//        switch (day) {
//            case 2:
//                System.out.println("Monday");
//                break;
//            case 3:
//                System.out.println("Tuesday");
//                break;
//            case 4:
//                System.out.println("Wednesday");
//                break;
//            case 5:
//                System.out.println("Thursday");
//                break;
//            case 6:
//                System.out.println("Friday");
//                break;
//            case 1:
//            case 7:
//                System.out.println("Weekend");
//                break;
//            default:
//                System.out.println("There is no such day, write from 1 to 7");
//
//        }
//        return day;
//    }
       /* int n = -10;
        while(n != 0){
            System.out.println("while n =" + n);
            n++;
        }
        System.out.println("main n =" + n);
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.println("i is: " + i + " J is :" + j);
            }*/


//    int ii = 1;
//
//    while (ii < 11) {
//        System.out.println("ii = " + ii);
//        System.out.println("+++++++++++++++++++");
//        int jj = 1;
//        while (jj < 11) {
//            System.out.println("jj = " + jj);
//            jj++;
//        }
//        System.out.println("+++++++++++++++++++");
//        ii++;
//    }
    public static void exampl(){
        int x=5, y=4, z=7;
        System.out.println(x>y && x>z || y<z);
        System.out.println((x<z || y>z) && x<y);

    }

    public static void main(String[] args) {
        exampl();
    }


}



