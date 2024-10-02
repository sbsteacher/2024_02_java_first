package org.example.day02.ch04;

public class LogicalOp {
    public static void main(String[] args) {
        //논리연산자, Logical Operator
        //연산의 결과는 boolean 타입

        // && (and) : 양쪽 모두 true이어야만 true, 한쪽이 false라면 결과는 false
        // || (or) (shift + \) : 양쪽 중 true가 있으면 결과는 true, 없으면 false
        // ! (not) : 부정, 반대 > 결과를 반대로 반든다.

        boolean r1 = true && true;
        System.out.println("r1: " + !r1); //false
        System.out.println("r1: " + r1); //true

        System.out.println("r2: " + (true && true && false));
        //                 "r2: (true && true) && false
        //                 "r2: true && false
        //                 "r2: false

        System.out.println("r3: " + (true || true || false));
        //                 "r3: (true || true) || false
        //                 "r3: true || false
        //                 "r3: true
        System.out.println("r4: " + (false || false || false));

        System.out.println("r5: " + true);
        System.out.println("r6: " + !true);
        System.out.println("r7: " + !!true);
    }

}
