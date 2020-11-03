package com.company.day06;

public class arrrevers {
    public static void main(String[] args) {
        int[] arrayc=new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int a , b ;
        a =arrayc[0];
        b= arrayc[arrayc.length-1];
        int c=0;
        int d=0;
        d=arrayc.length-1;
        for(int i=0;i<(arrayc.length/2);i++){
            arrayc[c]=b;
            arrayc[d]=a;
            c++;
            d--;
            a=arrayc[c];
            b=arrayc[d];
            if (c==d){
                break;
            }
        }
        plarr(arrayc);
    }
    public static void plarr(int[] arr){
     //   int[] arrayB=new int[]{3,121,443,6563213,1231,232};
        for (int i =0; i <arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
