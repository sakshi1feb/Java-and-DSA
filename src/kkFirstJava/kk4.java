package kkFirstJava;

import java.util.Scanner;

public class kk4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number \n Enter the first Number:");
        int n=sc.nextInt();
        System.out.println("Enter the second Number: ");
        int m=sc.nextInt();
        System.out.println("Enter operator(+,-,*,/)");
        char ch=sc.next().trim().charAt(0);
        if(ch=='+')
            System.out.println("The sum of the two numbers is"+(n+m));
        else if(ch=='-')
            System.out.println("The difference between the two numbers is "+Math.abs(n-m));
        else if(ch=='*')
            System.out.println("The product of the two numbers is "+ (n*m));
        else if(ch=='/')
            System.out.println("The quotient when "+n +"is divided by "+m +"+ is "+(n/m));
        else
            System.out.println("Not a valid operator");
    }
}
