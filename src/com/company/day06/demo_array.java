package com.company.day06;

public class demo_array {
    public static void main(String[] args) {
        int[] arraya =new int[300];
        int[] arrayb =new int[]{5,6,7};
        int[] arrayc ={7,8,9};
        System.out.println(arrayb[0]);
        System.out.println("A的地址："+arraya);
        System.out.println("B"+arrayb);
        arrayb[1] =9;
        System.out.println(arrayb[1]);
        sum(3,5);
        arrpln();
    }
    public static  void sum(int a,int b ){
        System.out.println(a+b);

    }
    public static void arrpln(){
        int[] arrayA=new int[]{1,2,3,4,5,6,7};
        for (int i=0;i<arrayA.length;i++){
            System.out.println(arrayA[i]);
        }
    }
}
