package PatternQuestion;

import java.util.Scanner;

public class kk5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of N");
        int n=sc.nextInt();
        /*for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j==0 || i-j>=0 && i<=(n-1)/2|| i+j<=n-1 && i>=(n-1)/2 )
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }*/
        for (int i = 0; i <2*n; i++) {
            int c=i>n?2*n-i:i;
            for(int j=0;j<c;j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
