package org.example.day03.ch05;

public class BreakBasic2 {
    public static void main(String[] args) {
        for(int i=0; i<100; i++) {
            System.out.println(i);

            if(i == 9) {
                break;
            }
        }
        System.out.println(" -- 끝 -- ");
    }
}
