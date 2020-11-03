package com.company.day05;

public class methoddefine {
    public static void main(String[] args) {
        //sum(3,5);
        int suma = sum(3,5);
        //System.out.println(sum(3,5));
        System.out.println(suma);
        System.out.println(istrue(30,20));
        System.out.println(sum100(200));
    }

    public static int sum(int a, int b){
        int result = a + b;
        return result;
    }

    public static boolean istrue(int a, int b){
        return a==b;
    }

    public static int sum100(int a){
        int sum = 0;
        for(int b = 1; b <= a;  b++){
            sum=sum+b ;
        }
        return sum;
    }
}
