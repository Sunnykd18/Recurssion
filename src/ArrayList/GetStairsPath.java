package ArrayList;


import java.util.ArrayList;
import java.util.Scanner;

public class GetStairsPath {
    public static void main (String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> paths = gsp(n);
        System.out.println(paths);

    }
    public static ArrayList<String> gsp(int n ){
        if(n == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }else if ( n< 0){
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        }

        ArrayList<String> paths1 = gsp(n-1);
        ArrayList<String> paths2 = gsp(n-2);
        ArrayList<String> paths3 = gsp(n-3);

        ArrayList<String> paths = new ArrayList<>();

        for (String path: paths1){
            paths.add(1 + path);
        }
        for (String path: paths2){
            paths.add(2 + path);
        }
        for (String path: paths3){
            paths.add(3 + path);
        }
        return  paths;
    }
}
