package BinarySearch.BS_on_answers;

public class SQRT_num {
    //find the square root of a number in log n
    //optimal approach
    public static int sqrt(int n){
        int low = 0, high = n;
        while(low<=high){
            int mid = low + (high - low) / 2;
            int val=mid*mid;
            if(val==n){
                return mid;
            } else if(val<=n){
                low = mid + 1; // search in the right part
            } else {
                high = mid - 1; // search in the left part
            }
        }
        return high; // high will be the floor value of sqrt(n)
    }
}
