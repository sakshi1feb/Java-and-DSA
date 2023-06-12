package kkFirstJava;

import java.util.Arrays;
import java.util.Scanner;

public class kk7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of terms in Fibonacci series(greater than 2): ");
        int n=sc.nextInt();
        int[] arr =new int [n];
        arr[0] =0;
        arr[1] =1;
        if(n>2){
            int a=0,b=1,c;
            for(int i=2;i<=n-1;i++){
                c=a+b;
                a=b;
                b=c;
                arr[i]=c;
            }
            System.out.println(Arrays.toString(arr));
        }else{
            System.out.println("The n value can't be negative");
        }
    }
}
