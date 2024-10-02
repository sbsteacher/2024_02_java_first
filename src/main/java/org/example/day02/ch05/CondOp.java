package org.example.day02.ch05;

public class CondOp {
    public static void main(String[] args) {
        // 식 ? true사용하는 값 : false사용하는 값

        int num = 23;

        System.out.println( (num % 2 == 0 ? "짝" : "홀") + "수입니다." );
    }
}
