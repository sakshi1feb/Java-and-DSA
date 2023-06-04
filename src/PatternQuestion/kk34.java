package PatternQuestion;

import java.util.Scanner;

public class kk34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of N:");
        int n=sc.nextInt();
        for (int r =0; r <n; r++) {
            for(int col=n-r;col>=1;col--) {
                int c=col+64;
                System.out.print((char)c + " ");
            }
            System.out.println();
        }

    }
}
