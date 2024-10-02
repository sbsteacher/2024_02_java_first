package org.example.day02.ch05;

public class Mission2 {
    public static void main(String[] args) {
        //조건식(삼항식)을 이용하여 절댓값 만들기

        int num = 0;
        //20
        System.out.println(num < 0 ? -num : num);

        if(num < 0) {
            System.out.println(-num);
        } else {
            System.out.println(num);
        }



    }
}
