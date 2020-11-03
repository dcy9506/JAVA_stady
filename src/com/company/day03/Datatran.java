package com.company.day03;

import java.sql.SQLOutput;

public class Datatran {
    public static void main(String[] args) {
        int num = (int) 3.9;
        System.out.println(num);
        char A='A';
        char B='B';
        System.out.println(A+B);
        int a = 10;
        int b = 20;
        int c = a > b ? a: b;
        System.out.println(c);
        int d = a > b ? a+b : a-b ;
        System.out.println(d);
    }
}
