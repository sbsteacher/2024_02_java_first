package org.example.day02.ch05;

public class IfElseIfElse {
    public static void main(String[] args) {
        int num = -69;

        if(num >= 90) {
            System.out.println("A");
        } else if(num >= 80) { //90미만 80이상
            System.out.println("B");
        } else if(num >= 70) {
            System.out.println("C");
        } else {
            System.out.println("F");
        }
        System.out.println("-- 끝 --");
    }
}
