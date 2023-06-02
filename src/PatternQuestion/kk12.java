package PatternQuestion;

import java.util.Scanner;

public class kk12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of N ");
        int n=sc.nextInt();
        for(int r=0;r<2*n;r++){
            int s=r<n?r:2*n-r-1;
            int c=r<n?n-r:r-n+1;
            for(int j=0;j<=s;j++)
                System.out.print(" ");
            for (int j = 1; j <=c ; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
}
