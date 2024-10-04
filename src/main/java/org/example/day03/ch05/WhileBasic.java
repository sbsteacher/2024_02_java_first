package org.example.day03.ch05;

public class WhileBasic {
    public static void main(String[] args) {
        int num = 0;
        while(num < 0) {
            System.out.println("I like Java - " + num);
            num++;
        }
        System.out.println("---------");

        int num3 = 0;
        while(num3 < 5) {
            System.out.println( "I like Java " + (num3++) );
        }
        System.out.println("---------");

        for(int num2 = 0; num2 < 5; num2++) {
            System.out.println("I like Java " + num2);
        }
    }
}
