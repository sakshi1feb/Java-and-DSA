package kkFunctions;

import java.util.Scanner;

public class kk14 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter value of N:");
        int n=sc.nextInt();
        int sum=sumOfNaturalNum(n);
        System.out.println("The sum of first "+n+"natural numbers is "+sum);

    }

    static int sumOfNaturalNum(int n) {
        int sum=0;
        for(int i=1;i<=n;i++)
            sum+=i;
        return sum;
    }
}
