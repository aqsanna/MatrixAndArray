package com.company;

public class ArrayMethods {
    static void foo(char[] arr) {
        System.out.println(arr);
    }

    static char[] fooSecond(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 10;
            System.out.println("'" + arr[i] + "'");
        }
        return arr;
    }

    static int arrayMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }

    static int[] pritArray(int[] arr) {
        for (int i = 0; i <= 10; i++) {
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    static int[] printArraySecond(int[] arr) {
        int a = 10;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a + i;
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        return arr;
    }

    static int printMatrix(int[][] matrix) {
        int m = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = m++;
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();
        return m;
    }

    static boolean isExistingElement(int[] arr) {
        int z = 5;
        boolean val = false;
        for (int x : arr) {
            if (x == z) {
                val = true;
                break;
            }
        }

        return val;
    }

    static int arraySumElements(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    static int twoDimensionArray(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (i + 1) * (j + 1);

            }
        }
        for (int[] x : arr) {
            for (int y : x) {
                sum += y;
            }
        }
        return sum;
    }

    static int matrixSumDiaganal(int[][] array2) {
        int sum1 = 0;
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                if (i == j) {
                    sum1 += array2[i][j];
                }
            }

        }
        return sum1;
    }

    static int matrixSumSecondDiaganal(int[][] array3) {
        int sum2 = 0;
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                if ((i + j) == array3.length - 1) {
                    sum2 += array3[i][j];

                }
            }
        }
        return sum2;
    }

    public static void main(String[] args) {
        char[] f = {'A', 'B', 'C', 'D'};
        foo(f);
        fooSecond(f);
        int[] i = {1, 5, 6, 8, 2, 15};
        System.out.println(arrayMax(i));
        int[] day = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        pritArray(day);
        int[] arr = new int[11];
        printArraySecond(arr);
        int[][] matric = new int[4][5];
        printMatrix(matric);
        int[] array = {1, 2, 3, 3, 5, 6, 7, 8, 9, 10};
        System.out.println(arraySumElements(array));
        int[] num = {6, 8, 3, 7, 5, 6, 1, 55};
        System.out.println(isExistingElement(num));
        int[][] num2 = new int[3][5];
        System.out.println(twoDimensionArray(num2));
        int[][] array2 = {{11, 2, 3, 6},
                {5, 6, 8, 8},
                {9, 11, 11, 12},
                {13, 14, 15, 16}};
        System.out.println(matrixSumDiaganal(array2));
        int[][] array3 = {{11, 2, 3, 6},
                {5, 6, 8, 8},
                {9, 11, 11, 12},
                {13, 14, 15, 16}};
        System.out.println(matrixSumSecondDiaganal(array3));

    }
}

