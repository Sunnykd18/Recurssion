package ArrayList;


import java.util.Scanner;

public class TargetSumSubset {
    public static void main(String []args ){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new int[n];

        for (int i = 0 ; i< arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int tar = scn.nextInt();
        printTagetSumSubsets(arr,0,"", 0, tar);

    }
//set is the subset
//    sos is sum of subset
//    tar is target
    public static void printTagetSumSubsets(int[] arr, int idx , String set, int sos, int tar){
        if (idx == arr.length){
            if (sos == tar){
                System.out.println(set + ".");
            }
            return;
        }

        printTagetSumSubsets(arr, idx + 1, set + arr[idx] + ",",sos +arr[idx],  tar);
        printTagetSumSubsets(arr, idx + 1, set,sos ,  tar);
    }
}
