package org.example.day03.ch05;

public class DoWhileBasic {
    public static void main(String[] args) {
        int num = 0;
        do {
            System.out.println("I like Java - " + num);
            num++;
        } while(num < 0);
        System.out.println("-- 끝 --");
    }
}
