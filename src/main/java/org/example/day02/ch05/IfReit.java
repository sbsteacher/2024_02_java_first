package org.example.day02.ch05;

public class IfReit {
    public static void main(String[] args) {
        int num = -124;
        //num값이 양수이면서 짝수인지
        if(num < 0) { //num값이 음수였을 때
            if(num % 2 == 0) { //짝수
                System.out.println("음수면서 짝수");
            } else { // 홀수
                System.out.println("음수면서 홀수");                
            }
        } else { //num값이 양수였을 때
            if(num % 2 == 0) { //짝수
                System.out.println("양수면서 짝수");
            } else { // 홀수
                System.out.println("양수면서 홀수");
            }
        }


    }
}
