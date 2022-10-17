package com.company;

public class ComplexNumber {
    private int real, imagin;

    public ComplexNumber() {
        real = 0;
        imagin = 0;
    }

    public ComplexNumber(int tempReal, int tempImaginary) {
        this.real = tempReal;
        this.imagin = tempImaginary;
    }

    public static void main(String[] args) {
        ComplexNumber complexNumber = new ComplexNumber(3, 2);
        System.out.println(complexNumber.real + " + i" + complexNumber.imagin);
        ComplexNumber complexNumber1 = new ComplexNumber(9, 5);
        System.out.println(complexNumber1.real + " + i" + complexNumber1.imagin);
        ComplexNumber complexNumber2 = new ComplexNumber();
        complexNumber2 = complexNumber2.sum(complexNumber, complexNumber1);
        System.out.println(complexNumber2.real + " + i" + complexNumber2.imagin);

    }

    public ComplexNumber sum(ComplexNumber c1, ComplexNumber c2) {
        ComplexNumber complexNumber = new ComplexNumber();
        complexNumber.real = c1.real + c2.real;
        complexNumber.imagin = c1.imagin + c2.imagin;
        return complexNumber;
    }

}
