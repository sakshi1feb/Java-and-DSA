package kkFirstJava;

import java.util.Scanner;

//wap to input a no. and check if it is even or odd
public class kk1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        if(n%2==0)
            System.out.println("The input number is even");
        else
            System.out.println("The input number is odd ");

    }


}
