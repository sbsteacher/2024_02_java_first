package org.example.day03.ch05;

import java.util.Scanner;

public class ScannerBasic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("이름을 입력하세요: ");
        String name = scan.next();
        System.out.println("name : " + name);
        System.out.print("성별을 입력하세요(여/남): ");
        String gender = scan.next();
        if( "여".equals(gender)  ) {
            System.out.println("여자입니다.");
        } else if( gender.equals("남")  ) {
            System.out.println("남자입니다.");
        }
        System.out.println(" -- 끝 -- ");

    }
}
