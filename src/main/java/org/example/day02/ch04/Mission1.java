package org.example.day02.ch04;

import org.example.day01.ch01.SystemOutPrintLn;

public class Mission1 {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20, num3 = 30;

        num1 = num2 = num3;

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        System.out.println("num3: " + num3);
    }
}
