package com.company.day06;

public class arrmax {
    public static void main(String[] args) {
        int[] arrayB=new int[]{3,121,443,6563213,1231,232};
        int max=0;
        for (int i =0; i <arrayB.length;i++){
            if (arrayB[i]>max) {
                max = arrayB[i];
            }
        }
        System.out.println(max);
    }
}
