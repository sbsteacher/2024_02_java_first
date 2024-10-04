package org.example.day03.ch05;

public class ForBasic {
    public static void main(String[] args) {
        //(0)첫번째칸: 초기화 담당
        //(1)두번째칸: 식(언제까지 반복할까), true인 동안
        //(3)세번째칸: 증감식
        //(2) {} 중괄호 사이

        // 0 > 1 > 2 > 3
        //   > 1 > 2 > 3 ... 계속 반복
        for(int i=9; i>=0; i = i - 1) {
            System.out.println("i:" + i + ", 반복");
        }
        System.out.println(" -- 끝 --");

        System.out.println("i:" + 9 + ", 반복");
        System.out.println("i:" + 8 + ", 반복");
        System.out.println("i:" + 7 + ", 반복");
    }
}
