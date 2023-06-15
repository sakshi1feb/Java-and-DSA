package kkFunctions;

import java.util.Scanner;

public class kk4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two  numbers \n1st Number: ");
        int a=sc.nextInt();
        System.out.println("2nd Number");
        int b=sc.nextInt();
        System.out.println("The sum of the two number's is "+sum(a,b));
    }
    static int sum(int a ,int b){
        return a+b;
    }
}
