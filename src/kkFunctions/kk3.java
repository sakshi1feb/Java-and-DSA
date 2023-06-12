package kkFunctions;

import java.util.Scanner;

public class kk3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age ");
        int age=sc.nextInt();
        votingEligibility(age);
    }

     static void votingEligibility(int age) {
        if(age>=18)
            System.out.println("You are eligible to give vote ");
        else
            System.out.println("You are not allowed to vote");
    }
}
