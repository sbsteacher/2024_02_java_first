package org.example.day02.ch05;

public class IfReit3 {
    public static void main(String[] args) {
        int num = -123;
        String str1 = "양";
        if(num < 0) { str1 = "음"; }

        String oddEven = "홀";
        if(num % 2 == 0) { oddEven = "짝"; }

        System.out.printf("%s수면서 %s수이다.", str1, oddEven);
    }
}
