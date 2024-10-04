package org.example.day03.ch05;

public class MissionFor1 {
    public static void main(String[] args) {
        //안녕 5번 출력
        //14 > f
        //13 > t
        //12 > t
        //11 > t
        //10 > t
        //9 > t
        //8 > t
        for(int i=9 ; i < 14; i++) {
            System.out.println("안녕");
        }

        System.out.println("-------------");

        //Hello 4번
        //11 O
        //10 O
        //9 O
        //8 O
        //7 X
        //6 X
        for(int i=11 ; i > 7; i--) {
            System.out.println("Hello");
        }

    }
}
