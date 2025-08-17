package BinarySearch.BS_1D_array;

public class search_rotated_array_1 {
    // problem: search in a rotated sorted array
    /* Given a rotated sorted array arr[] and a target x, find the index of x   
       in arr[] or return -1 if it is not present in the array.
       The array may contain duplicates. */
    public static int search(int[]arr,int length,int target){
        int low=0,high=length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            if (arr[low]<=arr[mid]){
               if(arr[low]<=target && target<arr[mid]){
                    high=mid-1; // target is in the left sorted part
                } else {
                    low=mid+1; // target is in the right part
                }
            }
            if (arr[mid]<=arr[high]){
                if(arr[mid]<target && target<=arr[high]){
                    low=mid+1; // target is in the right sorted part
                } else {
                    high=mid-1; // target is in the left part
                }
            }
        }
        return -1;
    }
      
}
