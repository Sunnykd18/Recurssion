package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePathsByJump {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> paths = gmp(1, 1 , n ,m);
        System.out.println(paths);
    }
    // sr - source row
    // sc - source column
    // dr - destination row
    // dc -destination column
    public static ArrayList<String> gmp (int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> paths = new ArrayList<>();

        // horizontal moves
        for (int ms = 1; ms <= dc - sc; ms++) {
            ArrayList<String> hpaths = gmp(sr, sc + ms, dr, dc);
            for (String hpath : hpaths) {
                paths.add("h" + ms + hpath);
            }
        }
        // Vertical moves
        for (int ms = 1; ms <= dr - sr; ms++) {
            ArrayList<String> vpaths = gmp(sr + ms, sc, dr, dc);
            for (String vpath : vpaths) {
                paths.add("v" + ms + vpath);
            }
        }
        // Diagonal moves
        for (int ms = 1; ms <= dr - sr && ms <= dc - sc; ms++) {
            ArrayList<String> dpaths = gmp(sr + ms, sc + ms, dr, dc);
            for (String dpath : dpaths) {
                paths.add("d" + ms + dpath);
            }
        }
        return paths;
    }
}
