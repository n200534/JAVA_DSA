package BinarySearch.BS_1D_array;

public class search_rotated_array_II {
    // problem: search in a rotated sorted array with duplicates
    /* Given a rotated sorted array arr[] and a target x, find the index of x   
       in arr[] or return -1 if it is not present in the array.
       The array may contain duplicates. */
    
    public static int search(int[] arr, int length, int target) {
        int low = 0, high = length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return mid; // found target
            }
            // Handle duplicates
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low++;
                high--;
                continue; // skip duplicates
            } else if (arr[low] <= arr[mid]) { // left part is sorted
                if (arr[low] <= target && target < arr[mid]) {
                    high = mid - 1; // target is in the left sorted part
                } else {
                    low = mid + 1; // target is in the right part
                }
            } else { // right part is sorted
                if (arr[mid] < target && target <= arr[high]) {
                    low = mid + 1; // target is in the right sorted part
                } else {
                    high = mid - 1; // target is in the left part
                }
            }
        }
        return -1; // target not found
    }
}
