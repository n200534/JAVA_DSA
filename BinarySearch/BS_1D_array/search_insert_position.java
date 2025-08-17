package BinarySearch.BS_1D_array;

public class search_insert_position {
    //search insert position
    //Time Complexity: O(log n)
    //Space Complexity: O(1)
    //This method finds the index at which a target value can be inserted in a sorted array.
    //It uses binary search to efficiently locate the position.
    //If the target is found, it returns the index of the target.
    //If the target is not found, it returns the index where the target can be inserted
    //to maintain the sorted order.
    public static int searchInsert(int[]nums,int target){
        int left =0,right=nums.length-1;
        int ans = nums.length; // default to the end of the array
        while(left<=right){
            int mid=left +(right-left)/2;
            if (nums[mid]>=target){
                ans = mid; // update answer to the current mid
                right = mid -1; // search in the left half
            } else{
                left = mid + 1; // search in the right half
            }
        }
        return ans; // return the index where target can be inserted
    }
}
