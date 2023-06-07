package PatternQuestion;

import java.util.Scanner;

public class kk16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of N:");
        int n=sc.nextInt();
        int coef=1;
        for (int r = 0; r <= n; r++) {
            for(int s=0;s<=n-r-1;s++)
                System.out.print("  ");
            for(int col=0;col<=r;col++){
                if(col==0||r-col==0)
                    coef=1;
                else{
                    coef = coef * (r - col + 1) / col;
                }
                System.out.print(coef+"  ");
            }
            System.out.println();
        }

    }
}
