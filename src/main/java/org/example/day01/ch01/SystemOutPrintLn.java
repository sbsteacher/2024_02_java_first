package org.example.day01.ch01;

public class SystemOutPrintLn {
    public static void main(String[] args) {
        System.out.println(7); // 정수 7
        System.out.println(3.15); // 실수(소수점이 붙은 숫자) 3.15
        System.out.println("3 + 5 = " + 8); // + 는 문자열 합치기 하는 연산자
        System.out.println("3 + 5 = " + "8"); // + 는 문자열 합치기 하는 연산자
        System.out.println("3 + 5 = 8"); //문자열 출력
        System.out.println(3 + 5);
        System.out.println("3" + 5);
        System.out.println("3" + 5 + 3);
        System.out.println("3" + (5 + 3));
    }
}
