package PatternQuestion;

import java.util.Scanner;

public class kk28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of N ");
        int n=sc.nextInt();
        for(int i=0;i<2*n;i++){
            int c=i<n?i+1:2*n -i -1;
            int s=i<n?n-i-1:i-n+1;
            for(int j=0;j<=s;j++)
                System.out.print(" ");
            for(int j=1;j<=c;j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
