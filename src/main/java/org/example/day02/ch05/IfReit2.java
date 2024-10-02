package org.example.day02.ch05;

public class IfReit2 {
    public static void main(String[] args) {
        int num = 123;

        if(num < 0 && num % 2 == 0) {
            System.out.println("음수면서 짝수");
        } else if(num < 0) {
            System.out.println("음수면서 홀수");
        } else if(num % 2 == 0) {
            System.out.println("양수면서 짝수");
        } else {
            System.out.println("양수면서 홀수");
        }
        System.out.println(" 끝! ");
    }
}
