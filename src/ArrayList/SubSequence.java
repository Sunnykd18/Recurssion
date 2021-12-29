package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class SubSequence {
//    finding Subsequence for "abc"
    public static void main(String []args){
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList<String> res = gss(str);
        System.out.println(res);
    }
    public static ArrayList<String> gss(String str){
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = str.charAt(0);  // a
        String ros = str.substring(1);// bc
        ArrayList<String> rres = gss(ros); // [ --, -c, b-, bc] FAITH-> Lower lever thinking

        ArrayList<String> mres = new ArrayList<>();//creating new arraylist

        for (String rstr: rres){
            mres.add("" + rstr);
        }
        for (String rstr: rres){
            mres.add(ch + rstr);
        }
        return mres;

    }
}
