package BinarySearch.BS_1D_array;

public class implement_upper_bound {
    //lower bound
    //Time Complexity: O(log n)
    //Space Complexity: O(1)
    //This method finds the first index where the target can be inserted to maintain sorted order.
    //It uses a while loop to narrow down the search space.
    //If the target is less than or equal to the middle element, it narrows the search to the left half.
    //If the target is greater than the middle element, it narrows the search to the right half.
    //The loop continues until the left index is greater than the right index.
    //Finally, it returns the left index, which is the position where the target can be inserted.
    //This method is efficient for finding the lower bound in sorted arrays.
    public static int lowerbound(int[]arr,int target ){
        int left =0,right=arr.length-1;
        int ans = arr.length; // default to the end of the array
        while(left<=right){
            int mid =left +(right-left)/2;
            if(arr[mid]>=target){
                ans = mid; // update answer to the current mid
                right = mid -1; // search in the left half
            } else{
                left = mid + 1; // search in the right half
            }
        }
        return ans; // return the index where target can be inserted
    }

    //upper bound
    //Time Complexity: O(log n)
    //Space Complexity: O(1)
    //This method finds the first index where the target is greater than the middle element.
    //It uses a while loop to narrow down the search space.
    //If the target is less than or equal to the middle element, it narrows the search to the left half.
    //If the target is greater than the middle element, it narrows the search to the right half.
    //The loop continues until the left index is greater than the right index.
    //Finally, it returns the left index, which is the position where the target can be inserted.
    //This method is efficient for finding the upper bound in sorted arrays.
    //It returns the index of the first element that is greater than the target.
    //If all elements are less than or equal to the target, it returns the length of the array.
    //This is useful for scenarios where you want to find the position to insert an element
    //that is greater than all existing elements in a sorted array.
    //This method is efficient for searching in sorted arrays.
    //It returns the index of the first element that is greater than the target.
    //If the target is greater than or equal to all elements, it returns the length of the array.
    //This is useful for scenarios where you want to find the position to insert an element
    //that is greater than all existing elements in a sorted array.
    //This method is efficient for searching in sorted arrays.
    //It returns the index of the first element that is greater than the target.
    //If the target is greater than or equal to all elements, it returns the length of the array.
    //This is useful for scenarios where you want to find the position to insert an element
    //that is greater than all existing elements in a sorted array.
    //This method is efficient for searching in sorted arrays.
    public static int upperbound(int[]arr,int target ){
        int left =0,right=arr.length-1;
        int ans = arr.length; // default to the end of the array
        while(left<=right){
            int mid =left +(right-left)/2;
            if(arr[mid]>target){
                ans = mid; // update answer to the current mid
                right = mid -1; // search in the left half
            } else{
                left = mid + 1; // search in the right half
            }
        }
        return ans; // return the index where target can be inserted
    }
}
