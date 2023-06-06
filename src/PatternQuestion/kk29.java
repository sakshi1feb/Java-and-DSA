package PatternQuestion;

import java.util.Scanner;

public class kk29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of N:");
        int n=sc.nextInt();
        for (int r = 0; r <= n*2; r++) {
            int c=(r<=n)?r+1:2*n-r +1;
            int s=(r<=n)?n-r:r-n;
            for (int j = 1; j <=c ; j++) {
                System.out.print("* ");
            }
            for (int sp = 1; sp <=s ; sp++) {
                System.out.print("  ");
            }
            for (int sp = 1; sp <=s ; sp++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=c ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
