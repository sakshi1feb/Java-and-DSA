package kkFunctions;

import java.util.Scanner;

public class kk1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers \n 1st Number:");
        int a=sc.nextInt();
        System.out.println("2nd Number: ");
        int b=sc.nextInt();
        System.out.println("3rd Number: ");
        int c=sc.nextInt();
        int max = maximum(a,b,c);
        int min= minimum(a,b,c);
        System.out.println("The Maximum of the three number's is "+max);
        System.out.println("The Minimum of the three number's is "+min);
    }

     static int minimum(int a, int b, int c) {
//             if(a<b && a<c)
//                 return a;
//             else if(b<c)
//                 return b;
//             else
//                 return c;

             return (a<b && a<c)?a:(b<c)?b:c;
    }

    static int maximum(int a, int b, int c) {
        return Math.max(a,Math.max(b,c));
    }
}
