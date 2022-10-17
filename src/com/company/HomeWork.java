package com.company;

public class HomeWork {
    //Напишите метод, который принимает два параметра: массив целых
    //чисел М и еще одно целое число Х. Метод проверяет, находится ли
    //число Х в массиве.

    public static void main(String[] args) {
        HomeWork homeWork = new HomeWork();
        int[] array = {1, 5, 6, 14, 78, 105, 74, 1};
        System.out.println(homeWork.isExistsNumber(array, 14));
        homeWork.reversMeth(array);


    }

    // Reverse array

    public boolean isExistsNumber(int[] array, int num) {
        for (int number : array) {
            boolean b = (number == num);
            if (b) {
                return true;
            }
        }
        return false;
    }

    public void reversMeth(int[] arr) {
        System.out.println("Initial array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Revers array");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

    }
}

