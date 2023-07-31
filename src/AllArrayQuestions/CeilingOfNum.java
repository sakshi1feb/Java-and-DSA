package AllArrayQuestions;

import java.util.Arrays;
import java.util.Scanner;

/**
*       we are provided with a sorted array and a target element we have to return the celling value for
 *       the target element from the sorted array.Celling value= number from the array the that is
 *       equal to the target or the smallest number that is greater than the target element.
* */
public class CeilingOfNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
//        int i=0;
        System.out.println("Enter the elements of the array in a sorted manner");
       for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt();
       }
        System.out.println("Array: "+ Arrays.toString(arr));
        System.out.println("Enter the target element to count celling: ");
        int target=sc.nextInt();
        System.out.println("The celling of "+target+" is "+celling(arr,target));
    }

    static int celling(int[] arr, int target) {
        int start=0;
        int end=arr.length;
        int mid=-1;
        while (start<=end){
            mid=start+(end-start)/2;
            if(target==arr[mid]){
                return arr[mid];
            }else if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }
        }
        return arr[start];
    }
}
