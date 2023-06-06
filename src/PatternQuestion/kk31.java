package PatternQuestion;

import java.util.Scanner;

public class kk31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of N:");
        int n=sc.nextInt();
        int originalN=n;
        n=(n*2)-2;
        for (int r = 0; r <=n; r++) {
            for (int col = 0; col<=n ; col++) {
                int displayVal= Math.min(Math.min(r,col), Math.min(n-r,n-col));
                System.out.print(originalN-displayVal+" ");
            }
            System.out.println();
        }

    }
}
