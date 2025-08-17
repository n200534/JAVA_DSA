package BinarySearch.BS_1D_array;

public class first_last_occurrence {
    // problem: find first and last occurrence of a number in a sorted array
    /*Given a sorted array arr[] and a target x, find the first and last occurrence (index) of x.
    If not present → return -1, -1.

    Example:
    arr = [2,4,4,4,6,7], x = 4
    Output → first = 1, last = 3 */

    //brute force approach
    public static int[] firstLastOccurrence(int[] arr, int target){
        int first=-1,last=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                if(first==-1) first=i; // first occurrence
                last=i; // last occurrence
            }
        }
        return new int[]{first, last};

    }
    //optimal approach using binary search
    // Time Complexity: O(log n) for each search, O(log n + log n) = O(log n)
    // Space Complexity: O(1) since we are using constant space
    // We will perform two binary searches: one for the first occurrence and one for the last
    // occurrence of the target element.
    // The first search will find the first occurrence by continuing to search left even after finding the
    // target, and the second search will find the last occurrence by continuing to search right after
    // finding the target.
    // This ensures that we find the correct indices for both occurrences.
    // The binary search will be performed on the sorted array, which allows us to efficiently find
    // the first and last occurrences of the target element.    

    public static int binarySearchFirst(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int first = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                first = mid; // found target, but continue searching left
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return first;
    }
    public static int binarySearchLast(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int last = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                last = mid; // found target, but continue searching right
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return last;
    }
    public static int[] firstLastOccurrenceOptimal(int[] arr, int target){
        int first = binarySearchFirst(arr, target);
        if (first == -1) {
            return new int[]{-1, -1}; // target not found
        }
        int last = binarySearchLast(arr, target);
        return new int[]{first, last};
    }


    //count the number of occurrences of the target element
    public static int countOccurrences(int[] arr, int target) {
        int first = binarySearchFirst(arr, target);
        if (first == -1) {
            return 0; // target not found
        }
        int last = binarySearchLast(arr, target);
        return last - first + 1; // count = last index - first index + 1
    }
     

}
