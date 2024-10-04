package org.example.day03.ch05;

public class ContinueBasic {
    public static void main(String[] args) {
        for(int i=0; i<15; i++) {
            if(i == 9) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println(" -- 끝 -- ");
    }
}
