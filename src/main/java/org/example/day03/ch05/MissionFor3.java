package org.example.day03.ch05;

public class MissionFor3 {
    public static void main(String[] args) {
        int star = (int)(Math.random() * 7.0) + 2; //2~8 사이의 랜덤값
        System.out.println("star: " + star);

        for(int i=0; i<star ;i++) {
            System.out.print("*");
        }

        //나온 숫자만큼 *이 옆으로 출력되도록 해주세요.
        //star: 5
        //*****

        //star: 3
        //***


    }
}
