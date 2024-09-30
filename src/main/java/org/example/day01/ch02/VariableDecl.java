package org.example.day01.ch02;

public class VariableDecl {
    public static void main(String[] args) {
        //실수 float(4Byte), double(8Byte)
        //bit > byte > 1Kb > 1Mb > 1Gb > 1Tb
        double num1 = 1.00000001, num2 = 2.0000001;
        double result;

        result = num1 + num2;
        System.out.println(result);

    }
}
