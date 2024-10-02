package org.example.day02.ch05;

public class Mission1 {
    public static void main(String[] args) {
        int num = 36;

        if(num % 2 == 0) {
            System.out.println("짝수입니다.");
        } else {
            System.out.println("홀수입니다.");
        }

        if(num % 2 == 1) {
            System.out.println("홀수입니다.");
        } else {
            System.out.println("짝수입니다.");
        }

        if(num % 2 != 0) {
            System.out.println("홀수입니다.");
        } else {
            System.out.println("짝수입니다.");
        }

        if(num % 2 != 0) {
            System.out.print("홀");
        } else {
            System.out.print("짝");
        }
        System.out.println("수입니다.");

        /*
        num에 저장된 값이 짝수면 >>> "짝수입니다."
        num에 저장된 값이 홀수면 >>> "홀수입니다."
        출력되게 해주세요.
         */
    }
}
