package PatternQuestion;

import java.util.Scanner;

public class kk21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of N:");
        int n=sc.nextInt();
        int num=1;
        for (int r = 1; r <= n; r++) {
            for(int j=1;j<=r;j++){
                System.out.print(num++ +" ");
            }
            System.out.println();
        }

    }
}
