package com.company.day03;

public class method {
    public static void main(String[] args) {
        jia();
        if10();
        switch1();

    }
    public static void switch1(){
        int a = 12 ;
        switch(a){
            case 10:
                System.out.println("haha");
                break;
            case 9:
                System.out.println("xixi");
                break;
            default:
                System.out.println("mama");
                break;
        };
    }

    public static void if10(){
        int a =13 ;
        if (a>10){
            System.out.println("大于10");
        }else if (a<10){
            System.out.println("小于10");
        }else if (a==10){
            System.out.println("等于10");
        }
    }

    public static void jia() {
        int a=10;
        int c=a+10;
        System.out.println(c);
    }
}
