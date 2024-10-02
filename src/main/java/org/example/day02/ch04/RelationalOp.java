package org.example.day02.ch04;

public class RelationalOp {
    public static void main(String[] args) {
        //관계연산자, 비교연산자, Relational Operator
        System.out.println("3 >= 2 : " + (3 >= 2)); //2보다 3이 이상인가? true
        System.out.println("3 >= 3 : " + (3 >= 3)); //3보다 3이 이상인가? true
        System.out.println("3 > 3 : " + (3 > 3)); //3보다 3이 초과인가? false
        System.out.println("3 < 3 : " + (3 < 3)); //3보다 3이 미만인가? false
        System.out.println("1 < 3 : " + (1 < 3)); //3보다 1이 미만인가? true
        System.out.println("1 <= 3 : " + (1 <= 3)); //3보다 1이 이하인가? true
        System.out.println("3 <= 3 : " + (3 <= 3)); //3보다 3이 이하인가? true
        System.out.println("3 == 3 : " + (3 == 3)); //3과 3이 같은가? true
        System.out.println("3 == 4 : " + (3 == 4)); //3과 4가 같은가? false

        System.out.println("3 != 3 : " + (3 != 3)); //3과 3이 다른가? false
        System.out.println("3 != 4 : " + (3 != 4)); //3과 4가 다른가? true
        //비교연산자의 결과 타입은 boolean 타입
        boolean r = 3 >= 2;
        System.out.println("r: " + r);
        boolean r2 = true;
    }
}
