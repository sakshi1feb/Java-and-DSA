package kkFunctions;

import java.util.Scanner;

public class kk2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check even or odd ");
        int n=sc.nextInt();
        System.out.println("The number is "+evenOdd(n));
    }

    static String evenOdd(int n) {
        return (n%2==0)?"even":"odd";
    }
}
