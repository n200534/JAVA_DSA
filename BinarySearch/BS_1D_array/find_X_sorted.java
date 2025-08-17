package BinarySearch.BS_1D_array;

public class find_X_sorted {
    //iterative binary search
    //Time Complexity: O(log n)
    //Space Complexity: O(1)
    //This method returns the index of the target if found, otherwise returns -1.
    //It uses a while loop to repeatedly divide the search interval in half.
    //If the target is less than the middle element, it narrows the search to the left half.
    //If the target is greater than the middle element, it narrows the search to the right half.
    //If the target is equal to the middle element, it returns the index of the middle element.
    //If the search interval is empty, it returns -1 indicating that the target is not found.
    //This method is efficient for searching in sorted arrays.
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // avoid overflow

            if (arr[mid] == target) {
                return mid; // found
            } 
            else if (arr[mid] < target) {
                left = mid + 1; // search right half
            } 
            else {
                right = mid - 1; // search left half
            }
        }
        return -1; // not found
    }
    //recursive binary search
    //Time Complexity: O(log n)
    //Space Complexity: O(log n) due to recursive stack space
    //This method is a recursive implementation of binary search.
    //It takes the array, target value, left index, and right index as parameters.
    //It calculates the middle index and checks if the target is equal to the middle element.
    //If it is, it returns the middle index.
    //If the target is less than the middle element, it recursively searches the left half.
    //If the target is greater than the middle element, it recursively searches the right half.
    //If the target is not found, it returns -1.
    public static int binarySearchRecursive(int[] arr, int target, int left, int right) {
        if(left > right) {
        return -1; // not found
    }

    int mid = left + (right - left) / 2;

    if (arr[mid] == target) {
        return mid;
    } 
    else if (arr[mid] < target) {
        return binarySearchRecursive(arr, mid + 1, right, target);
    } 
    else {
        return binarySearchRecursive(arr, left, mid - 1, target);
    }
    }
                  
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;
        int result = binarySearch(arr, target);
        
        if (result != -1) {
            System.out.println("Found at index: " + result);
        } else {
            System.out.println("Not found");
        }
    }

    //overflow case 
    public static int binarySearchOverflow(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            // Use this to avoid overflow
            int mid = left + (right - left) / 2; 

            if (arr[mid] == target) {
                return mid; // found
            } 
            else if (arr[mid] < target) {
                left = mid + 1; // search right half
            } 
            else {
                right = mid - 1; // search left half
            }
        }
        return -1; // not found
    }
}
