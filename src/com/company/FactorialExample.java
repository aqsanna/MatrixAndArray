package com.company;

public class FactorialExample {


    public static void main(String[] args) {

        FactorialExample factorialExample = new FactorialExample();
        factorialExample.factorial(10);
        System.out.println(factorialExample.fibonacci(10));
        System.out.println(factorialExample.fibonacciWithIterative(10));
        factorialExample.calculateSumNumber(5);

    }

    int factorial(int n) {
        int result;

        if (n == 1 || n == 0)
            return 1;
        else {
            result = factorial(n - 1) * n;
            System.out.println(n + "! = " + result);
        }
        return result;

    }

    int fibonacci(int n) {
        int result;

        if (n == 1 || n == 0)
            return n;
        else {
            result = fibonacci(n - 1) + fibonacci(n - 2);
        }
        return result;

    }

    // implement iterative fibonacci numbers
    int fibonacciWithIterative(int n) {
        if (n <= 1) {
            return n;
        } else {
            int fib = 0;
            int a = 1;
            for (int i = 0; i < n; i++) {
                int temp = fib;
                fib = fib + a;
                a = temp;
                System.out.println(a);
            }

            return fib;
        }
    }

    //Sum of x number calculate recursively
    int calculateSumNumber(int n) {
        int sum;
        if (n <= 1) {
            return n;
        } else {
            sum = calculateSumNumber(n - 1) + n;
            System.out.println(n + "Sum = " + sum);
        }
        return sum;
    }
}