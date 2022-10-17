package com.company;

public class Stack {
    int[] stck;
    int tos;

    Stack(int n) {
        tos = -1;
        this.stck = new int[n];
    }

    Stack() {
        stck = new int[2];
        tos = -1;
    }

    public static void main(String[] args) {
//        int [] tiv={1,6,8,7,47};
        Stack stack = new Stack(6);
        stack.push(9);
        stack.push(15);
        stack.push(2);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        Fifostack fifostack = new Fifostack(4);
        fifostack.push(3);
        fifostack.push(4);
        fifostack.push(5);
        fifostack.push(6);

        System.out.println(fifostack.pop());
        System.out.println(fifostack.pop());
        System.out.println(fifostack.pop());
        System.out.println(fifostack.pop());

    }

    void push(int item) {
        if (tos == stck.length - 1)
            System.out.println("is full");
        else
            stck[++tos] = item;
    }

    int pop() {
        if (tos < 0) {
            System.out.println("is empty ");
            return 0;
        } else
            return stck[tos--];
    }

    // FIFO
    public static class Fifostack {
        int[] stack;
        int firstNumber;
        int lastNumber;

        Fifostack(int n) {
            stack = new int[n];
            firstNumber = -1;
            lastNumber = -1;
        }

        public void push(int item) {
            if (firstNumber == stack.length - 1) {
                System.out.println("stack is full");
            } else
                stack[++firstNumber] = item;
        }

        public int pop() {
            if (lastNumber == firstNumber) {
                System.out.println("stack is empty");
                return 0;
            } else return stack[++lastNumber];
        }

    }

}


