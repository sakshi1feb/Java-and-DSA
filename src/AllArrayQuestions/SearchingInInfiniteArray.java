package AllArrayQuestions;
/**
 *  find the position of an element in a infinite array.(It means we cannot use array.length property.
 * */
public class SearchingInInfiniteArray {
    public static void main(String[] args) {
        int[] arr={3,5,7,9,10,90,100,130,140,160,170};
        int target = 90;
        System.out.println("The position of the target element is "+ans(arr,target));
    }
    static int ans(int[]arr, int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int newStart=end+1;
            end = end +(end-start+1)*2;
            start=newStart;
        }
        return BinarySearch(arr,target,start,end);
    }
    static int BinarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid=start +(end -start)/2;
            if(target==arr[mid])
                    return mid;
            else if (target>arr[mid])
                start=mid+1;
            else
                end=mid-1;
        }
        return -1;
    }
}
