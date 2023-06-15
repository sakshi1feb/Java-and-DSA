package kkFunctions;

import java.util.Scanner;

public class kk10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check if it is palindrome or not ");
        int n=sc.nextInt();
        int m=revNumber(n);
        if(m==n)
            System.out.println("The number is palindrome");
        else
            System.out.println("The number is not palindrome");
    }

    static int revNumber(int n) {
        int r=0,nn=0;
        while(n>0){
            r=n%10;
            nn=nn*10+r;
            n/=10;
        };
        return nn;
    }
}
