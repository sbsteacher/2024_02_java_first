package org.example.day02.ch05;

public class BiggerValueDiff {
    public static void main(String[] args) {
        int num1=25, num2=7; //num1, num2는 정수값이 들어갈 수 있다.

        //더 큰 값과 두 값의 차이(양수)를 출력
        //num1=5, num2=7 였을 때는 아래처럼 나와야 한다.
        //큰값: 7, 차이: 2

        //num1=15, num2=7 였을 때는 아래처럼 나와야 한다.
        //큰값: 15, 차이: 8
        int big;
        int diff;

        big = (num1 > num2) ? num1 : num2;
        diff = (num1 > num2) ? (num1 - num2) : (num2 - num1);

        System.out.println("큰 수: " + big);
        System.out.println("절댓값: " + diff);
    }
}
