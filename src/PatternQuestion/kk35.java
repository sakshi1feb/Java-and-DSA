package PatternQuestion;

import java.util.Scanner;

public class kk35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of N:");
        int n=sc.nextInt();
        for (int r = 1; r <=n; r++) {
            for (int col = 1; col <=r ; col++)
                System.out.print(col+" ");
            for(int s=0;s<n-r;s++)
                System.out.print("  ");
            for(int s=0;s<n-r;s++)
                System.out.print("  ");
            for(int col=r;col>=1;col--)
                System.out.print(col+" ");
            System.out.println();
        }
    }
}
