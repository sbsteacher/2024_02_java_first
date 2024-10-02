package org.example.day02.ch05;

public class BiggerValueDiff2 {
    public static void main(String[] args) {
        int num1=17, num2=45; //num1, num2는 정수값이 들어갈 수 있다.

        //더 큰 값과 두 값의 차이(양수)를 출력
        //num1=5, num2=7 였을 때는 아래처럼 나와야 한다.
        //큰값: 7, 차이: 2

        //num1=15, num2=7 였을 때는 아래처럼 나와야 한다.
        //큰값: 15, 차이: 8
        int bigger = num1 > num2 ? num1 : num2;
        int diff = num1 - num2;
        if(diff < 0) { diff = -diff; }
        System.out.printf("큰값: " + bigger + ", 차이: " + diff);
    }
}
