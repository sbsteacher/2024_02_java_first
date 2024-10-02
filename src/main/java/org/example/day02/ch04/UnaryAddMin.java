package org.example.day02.ch04;

public class UnaryAddMin {
    public static void main(String[] args) {
        // 단항 연산자들
        // 부호 연산자: +, -
        int num1 = 5;
        System.out.println(+num1);
        System.out.println(num1);
        System.out.println(-num1);
        System.out.println(num1 * -1);
        System.out.println(num1);

        num1 = -num1;
        System.out.println(num1);

        int num2 = 10;
        int num3 = 20 + +num2;
        System.out.println("num3: " + num3);

        int num4 = 20 + (-num2);
        System.out.println("num4: " + num4);


    }
}
