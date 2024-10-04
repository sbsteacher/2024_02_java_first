package org.example.day03.ch05;

public class MissionFor4 {
    public static void main(String[] args) {
        int dan = (int)(Math.random() * 8) + 2; //2 ~ 9 랜덤값

        for(int i=1; i<10; i++) {
            System.out.println(dan + " x " + i + " = " + dan * i);
        }
        System.out.println("--------------");
        for(int i=1; i<10; i++) {
            System.out.printf("%d x %d = %d\n", dan, i, (dan * i));
        }
        /*
        dan = 5; 였다면
        5 x 1 = 5
        5 x 2 = 10
        5 x 3 = 15
        ...
        5 x 9 = 45

        dan = 9; 였다면
        9 x 1 = 9
        9 x 2 = 18
        9 x 3 = 27
        ...
        9 x 9 = 81
         */
    }
}
