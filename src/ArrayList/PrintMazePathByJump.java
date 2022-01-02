package ArrayList;

import java.util.Scanner;

public class PrintMazePathByJump {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        printMPJ( 1, 1, n, m, "");

    }
    // sr - source row
    // sc - source column
    // dr - destination row
    // dc -destination column
    public static void printMPJ(int sr, int sc, int dr, int dc,String psf){
        if (sr == dr && sc == dc){
            System.out.println(psf);
            return;
        }

        for(int ms = 1; ms <= dc-sc; ms++){
            printMPJ(sr,sc + ms, dr, dc,psf +"h"+ ms);
        }
        for(int ms = 1; ms <= dr - sr; ms++){
            printMPJ(sr + ms,sc , dr, dc,psf +"v"+ ms);
        }
        for(int ms = 1; ms <= dc-sc && ms <= dr - sr; ms++){
            printMPJ(sr + ms,sc + ms, dr, dc,psf +"d"+ ms);
        }

    }
}
