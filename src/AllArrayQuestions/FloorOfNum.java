package AllArrayQuestions;

import java.util.Scanner;

public class FloorOfNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the target:");
        int target=sc.nextInt();
        int[] arr={2,3,5,9,14,16,18};

        System.out.println("The floor of the "+target+" is "+floorFromArr(arr,target));
    }

     static int floorFromArr(int[] arr, int target) {
         int start=0;
         int end=arr.length;
         int mid=-1;
        while(start<=end){
            mid=start+(end-start)/2;
            if(target==arr[mid]){
                return arr[mid];
            }else if(target>arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return arr[end];
    }
}
