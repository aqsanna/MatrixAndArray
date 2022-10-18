package com.company;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("Nisan");
        cars.add("BMW");
        cars.add("Eraz");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.get(2));
        cars.set(2,"Mersedes");
        System.out.println(cars.get(2));
        System.out.println(cars);
//        cars.remove(0);
//        System.out.println(cars);
//        cars.clear();
//        System.out.println(cars);
        cars.size();
        System.out.println(cars.size());
        for(int i = 0; i<cars.size(); i++){
            System.out.println(cars.get(i));
        }
        System.out.println("-------------");
        for (String i : cars){
            System.out.println(i);
        }
        System.out.println("-------------");
        Collections.sort(cars);
        for(String i: cars){
            System.out.println(i);
        }
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        Collections.sort(myNumbers);  // Sort myNumbers

        for (int i : myNumbers) {
            System.out.println(i);
        }
    }
}
