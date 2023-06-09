package kkFirstJava;

import java.util.Scanner;

public class kk3 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principle amount ");
        int p=sc.nextInt();
        System.out.println("Enter Rate of Interest in % ");
        double rate=sc.nextDouble();
        System.out.println("Enter Time in years: ");
        double years=sc.nextInt();
        double si= p*years*(rate/100);
        System.out.println("The simple Interest is "+si);
    }
}
