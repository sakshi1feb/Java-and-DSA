package PatternQuestion;

import java.util.Scanner;

public class kk11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of N ");
        int n=sc.nextInt();
        for(int r=0;r<n;r++){
            for(int s=0;s<=r;s++)
                System.out.print(" ");
            for (int c = 1; c <=n-r; c++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
}
