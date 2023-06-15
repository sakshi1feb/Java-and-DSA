package kkFunctions;

import java.util.Scanner;

public class kk12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter three numbers to check pythagoras triplets\n1st Number");
        int a=sc.nextInt();
        System.out.println("2nd Number");
        int b=sc.nextInt();
        System.out.println("3rd Number");
        int c=sc.nextInt();
        if(a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a)
            System.out.println("the three numbers form a pythagoras triplet");
        else
            System.out.println("They do not form a pythagoras triplet");
    }
}
