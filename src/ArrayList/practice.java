package ArrayList;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
//        Pattern
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int st = 1;

        int sp = 2 * n - 3;
        int v = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= st; j++) {
                System.out.print( v + "\t");
                v++;

            }
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            if (i == n){
                st--;
                v--;
            }
            for (int j = 1; j <= st; j++) {
                v--;
                System.out.print(v +"\t");
            }

            st++;
            sp -= 2;

            System.out.println();
        }
    }


}

