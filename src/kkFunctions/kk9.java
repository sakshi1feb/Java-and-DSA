package kkFunctions;

import java.util.Scanner;

public class kk9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find factorial ");
        int n=sc.nextInt();
        System.out.println("The factorial of the number is "+factorial(n));
    }

    static int factorial(int n) {
        int fact=1;
        if(n==0|| n==1)
            return 1;
        else{
            for(int i=n;i>=1;i--)
                fact=fact*i;
        }
        return fact;
    }
}
