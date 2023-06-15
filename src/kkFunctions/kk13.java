package kkFunctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class kk13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting point ");
        int a=sc.nextInt();
        System.out.println("Enter the end point ");
        int b=sc.nextInt();
        ArrayList <Integer> arr= primeNumbersInRange(a,b);
        System.out.println("Prime Numbers between the starting and ending point are \n"+ arr);
    }

     static ArrayList<Integer> primeNumbersInRange(int a, int b) {
       // int[] result=new int[b-a];
         ArrayList <Integer> list =new ArrayList<>();
        for(int i=a;i<=b;i++){

            int count =1;
            for(int j=1;j<=i/2;j++){
                if(i%j==0)
                    count++;
            }
            if(count==2)
                list.add(i);
        }
//         Integer[] objects = (Integer[]) list.toArray();
        return list;
    }
}
