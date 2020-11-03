package com.company.day03;

public class xunhuan {
    public static void main(String[] args) {
        for10();
        while10();
        dowhile10();
        one100();
    }

    public static void one100() {
        int a = 0;
        for (int b = 1; b <= 100; ++b) {
            if (b % 2 == 0) {
                a = a + b;
            }
        }
        System.out.println(a);
    }

    public static void dowhile10() {
        int a = 10;
        do {
            System.out.println("mimimi");
            --a;
        } while (a > 1);
    }

    public static void while10() {
        int a = 1;
        while (a < 10) {
            System.out.println("kkk");
            ++a;
        }
    }

    public static void for10() {
        for (int a = 1; a < 10; a++) {
            System.out.println("hahahaha");
        }
        System.out.println("hehe");
    }
}
