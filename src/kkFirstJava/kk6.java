package kkFirstJava;

import java.util.Scanner;

public class kk6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter currency in RS. ");
        int rs=sc.nextInt();
        int usd$ =rs*80;
        System.out.println("Rs in $ is $"+usd$);
    }
}
