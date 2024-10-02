package org.example.day02.ch04;

public class ArithOp {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 3;
        System.out.println("num1 + num2 = " + num1 + num2);
        //                 "num1 + num2 = " + "7" + 3
        //                 "num1 + num2 = 7" + 3
        //                 "num1 + num2 = 7" + "3"
        //                 "num1 + num2 = 73"
        System.out.println("num1 + num2 = " + (num1 + num2));
        //                 "num1 + num2 = " + (7 + 3)
        //                 "num1 + num2 = " + 10
        //                 "num1 + num2 = " + "10"
        //                 "num1 + num2 = 10"
        //num1 + num2 = 73
        System.out.println("num1 - num2 = " + (num1 - num2));
        System.out.println("num1 * num2 = " + (num1 * num2));
        System.out.println("num1 / num2 = " + ((float)num1 / num2));
        System.out.println("num1 % num2 = " + (num1 % num2)); //mod
        //2로 mod하여 홀짝 구분할 때도 사용한다. > 결과값이 0이면 짝, 1이면 홀
    }
}
