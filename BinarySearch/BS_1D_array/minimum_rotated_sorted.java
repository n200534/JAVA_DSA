package BinarySearch.BS_1D_array;

public class minimum_rotated_sorted {
    //with no duplicates
    /* problem: find the minimum element in a rotated sorted array
    Given a rotated sorted array arr[], find the minimum element in it.
    The array is guaranteed to be non-empty and may contain duplicates.
    Example:
    arr = [4,5,6,7,0,1,2], Output → 0
    arr = [2,2,2,0,1], Output → 0 */
    public static int findMin(int[]arr){
        int low=0,high=arr.length-1;
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=low +(high-low)/2;
            if(arr[low]<arr[mid]){
                ans=Math.min(ans,arr[low]); // left part is sorted, so minimum is at low
                low=mid+1; // search in the right part
            } else if(arr[mid]<arr[high]){
                ans=Math.min(ans,arr[mid]); // right part is sorted, so minimum is at mid
                high=mid-1; // search in the left part
            } else {
                // when arr[low] == arr[mid] == arr[high], we cannot determine which side to go
                low++;
                high--;
            }
        }
        return Math.min(ans, arr[low]); // check the last element
    }
}
