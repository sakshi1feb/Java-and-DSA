package PatternQuestion;

import java.util.Scanner;

public class kk32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of N:");
        int n=sc.nextInt();
        n=64+n;
        for (int r =n; r>=65; r--) {
            {
                for (int c =r; c<=n ; c++) {
                    System.out.print((char)c +" ");
                }

                }
            System.out.println();
        }

    }
}
