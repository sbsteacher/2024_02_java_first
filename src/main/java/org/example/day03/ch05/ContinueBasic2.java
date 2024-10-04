package org.example.day03.ch05;

public class ContinueBasic2 {
    public static void main(String[] args) {
        int i=0;
        while(i<15) {
            if(i == 9) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("-- 끝 --");
    }
}
