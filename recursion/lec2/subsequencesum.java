package recursion.lec2;

import java.util.ArrayList;
import java.util.List;

public class subsequencesum {
    
    static void solve(int[] arr, int index, int sum, int target, List<Integer> ds) {
        // Base case
        if (index == arr.length) {
            if (sum == target) {
                System.out.println(ds);
            }
            return;
        }

        // Pick the element
        ds.add(arr[index]);
        solve(arr, index + 1, sum + arr[index], target, ds);

        // Backtrack
        ds.remove(ds.size() - 1);

        // Not pick the element
        solve(arr, index + 1, sum, target, ds);
    }


    //printing only one subsequence
    static boolean printOneSubsequence(int[] arr, int index, int sum, int target, List<Integer> ds) {
        // Base case
        if (index == arr.length) {
            if (sum == target) {
                System.out.println(ds);
                return true;
            }
            return false;
        }

        // Pick the element
        ds.add(arr[index]);
        if (printOneSubsequence(arr, index + 1, sum + arr[index], target, ds)) {
            return true;
        }

        // Backtrack
        ds.remove(ds.size() - 1);
        // Not pick the element
        if (printOneSubsequence(arr, index + 1, sum, target, ds)) {
            return true;
        }
        return false;
    }



    //count of subsequences with sum k
    static int countSubsequences(int[] arr, int index, int sum, int target) {
        // Base case
        if (index == arr.length) {
            return sum == target ? 1 : 0;
        }
        // Pick the element
        int left = countSubsequences(arr, index + 1, sum + arr[index], target);
        // Not pick the element
        int right = countSubsequences(arr, index + 1, sum, target); 
        return left + right;
    }






    //Check if there exists a subsequence with sum K
    static boolean checkSubsequence(int[] arr, int index, int sum, int target){
        if(index==arr.length){
            return sum==target;
        }
        //pick the element
        if(checkSubsequence(arr, index+1, sum+arr[index], target)){
            return true;
        }
        //not pick the element
        if(checkSubsequence(arr, index+1, sum, target)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int k = 2;
        solve(arr, 0, 0, k, new ArrayList<>());
    }
}


