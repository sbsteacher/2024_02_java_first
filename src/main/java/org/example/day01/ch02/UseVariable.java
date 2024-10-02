package org.example.day01.ch02;

public class UseVariable {
    public static void main(String[] args) {
        //데이터 타입 (정수, 실수, 문자, 불린, 문자열, 레퍼런스형)
        //기본(primitive)타입, 참조타입

        //변수 선언!!!! > 변수 사용하겠다!!
        //변수? 데이터를 저장하는 공간, 데이터가 변할 수 있음
        // Java > Typed Language 데이터 타입이 굉장히 중요!!!

        int var1; //정수 타입의 var1 변수 선언을 하였다.
        // '=' 대입 연산자를 사용하여 변수 공간에 데이터를 집어 넣는다.
        // =는 대입연사자, 오른쪽에 있는 값을 복사하여 왼쪽 공간에 넣는다.
        var1 = 10; //초기화
        System.out.println(var1 + var1);

        var1 = 20;
        System.out.println(var1 + var1);
        //11 = 12;

        int var2 = 30; //초기화

    }
}
