package com.company;

public class MethodWithMethod {

    public static void main(String[] args) {
        MethodWithMethod methodWithMethod = new MethodWithMethod();
        int[] tiv = {1, 6, 8, 7, 47};
        methodWithMethod.kentTver(tiv);
    }

    boolean isOdd(int num) {
        return (num % 2 != 0);
    }

    public void kentTver(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (isOdd(arr[i])) System.out.print(arr[i] + " ");

        }
    }

}
