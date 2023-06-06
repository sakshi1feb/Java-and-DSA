package PatternQuestion;

import java.util.Scanner;

public class kk26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of N:");
        int n=sc.nextInt();
        for (int r = 0; r <n; r++) {
            for(int c=1;c<=n-r;c++){
                System.out.print(r+1+" ");
            }
            System.out.println();
        }

    }
}
