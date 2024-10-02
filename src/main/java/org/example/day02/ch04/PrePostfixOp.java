package org.example.day02.ch04;

public class PrePostfixOp {
    public static void main(String[] args) {
        int n1 = 10;

        //읽기, 쓰기 어느 것 먼저 할래 차이
        //prefix:        쓰기 > 읽기(사용)
        //postfix: 읽기(사용) > 쓰기
        System.out.println("n1++ : " + n1++);
        System.out.println("n1++ : " + n1++);
        System.out.println("n1 : " + n1);

        System.out.println();

        int n2 = 10;
        System.out.println("++n2 : " + ++n2);
        System.out.println("++n2 : " + ++n2);
        System.out.println("n2 : " + n2);
    }
}
