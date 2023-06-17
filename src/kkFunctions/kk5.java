package kkFunctions;

import java.util.Scanner;

public class kk5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers\n1st number");
        int a=sc.nextInt();
        System.out.println("2nd number ");
        int b=sc.nextInt();
        System.out.println("The product of the two numbers is "+Product(a,b));
    }

    static int Product(int a, int b) {
        return a*b;
    }
}
