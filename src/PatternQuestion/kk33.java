package PatternQuestion;

import java.util.Scanner;

public class kk33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of N:");
        int n=sc.nextInt();
        int ch=65;
        for (int r = 1; r <= n; r++) {
            for(int j=1;j<=r;j++){
               if(ch%2!=0) {
                   System.out.print(Character.toLowerCase((char) ch) + " ");
                   ch=ch+1;
               }
               else {
                   System.out.print((char) ch +" ");
                   ch=ch+1;
               }
           }

            System.out.println();
        }

    }
}
