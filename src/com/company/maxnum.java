package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class maxnum {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int [] arr = new int[n];
        for (int i = 0; i < arr.length ; i++){
            arr[i] = scn.nextInt();

        }
        int max = maxofArray(arr, 0);
        System.out.println(max);
    }
    public static int maxofArray(int[]arr, int idx){
        if (idx == arr.length -1 ){
            return arr[idx];
        }
        int misa = maxofArray(arr, idx+1);
        if (misa > arr[idx]){
            return misa;
        }else{
            return arr[idx];
        }
    }
}
