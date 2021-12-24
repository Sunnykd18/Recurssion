package com.company;

import java.util.Scanner;

public class DisplayArray {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int [] a1 = new int[n];
        for (int i = 0; i < a1.length ; i++){
            a1[i] = scn.nextInt();

        }
        da(a1, 0);
    }
    static void  da(int[] a1 , int idx){
        if (idx == a1.length){
            return;
        }
        System.out.println(a1[idx]);
        da(a1, idx + 1);

    }
}
