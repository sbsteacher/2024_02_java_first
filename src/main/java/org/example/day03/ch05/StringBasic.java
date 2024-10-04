package org.example.day03.ch05;

public class StringBasic {
    public static void main(String[] args) {
        String str = "안녕";
        String str2 = new String("안녕");

        System.out.println("str: " + str);
        System.out.println("str2: " + str2);
        System.out.println("str == str2 : " + (str == str2));
        System.out.println("str.equals(str2) : "
                + (str.equals(str2)) );

        boolean isSame = (str.equals(str2));
        boolean isSame2 = (str2.equals(str));
    }
}
