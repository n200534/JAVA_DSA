package BinarySearch.BS_1D_array;

public class floor_ceil {
    public static int ceil(int[]arr,int target){
        int left = 0, right = arr.length - 1;
        int ans = -1; // default to -1 if no ceil found
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= target) {
                ans = arr[mid]; // update answer to the current mid
                right = mid - 1; // search in the left half
            } else {
                left = mid + 1; // search in the right half
            }
        }
        return ans; // return the ceil value or -1 if not found
    }
    public static int floor(int[]arr,int target){
        int left = 0, right = arr.length - 1;
        int ans = -1; // default to -1 if no floor found
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= target) {
                ans = arr[mid]; // update answer to the current mid
                left = mid + 1; // search in the right half
            } else {
                right = mid - 1; // search in the left half
            }
        }
        return ans; // return the floor value or -1 if not found
    }
}
