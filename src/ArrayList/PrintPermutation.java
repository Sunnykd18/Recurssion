package ArrayList;

import java.util.Scanner;

public class PrintPermutation {
    public static void main(String []args){
        Scanner scn = new  Scanner(System.in);
        String str = scn.next();
        printP( str , "");

    }
    public static void printP(String ques, String asf){
        if (ques.length() == 0){
           System.out.println(asf);
           return;
        }
        for(int i = 0 ; i< ques.length(); i++){
            char ch = ques.charAt(i);
            String q1part = ques.substring(0, i);
            String qrpart = ques.substring(i + 1);
            String roq = q1part + qrpart;
            printP(roq , asf + ch);

        }
    }
}
