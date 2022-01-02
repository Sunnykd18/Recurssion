package ArrayList;

import java.util.Scanner;

public class PrintMazePaths {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        printMP(1,1,n,m,"");

    }
    public static void printMP(int sr, int sc, int dr, int dc,String psf){
        if( sc < dr || sc > dr){
            return;
        }
        if(sr == dr && sc == dc){
            System.out.println(psf);
        }
        printMP(sr,sc + 1, dr, dc, psf+"h");
        printMP(sr + 1,sc , dr, dc, psf+"v");
    }
}
