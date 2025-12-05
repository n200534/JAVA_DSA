package recursion.lec2;

import java.util.ArrayList;
import java.util.List;

public class combinationsum1 {
    // Problem Statement: Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.
    /*
    Example 1:
    Input: candidates = [2,3,6,7], target = 7
    Output: [[2,2,3],[7]]
    Explanation:
    2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
    7 is a candidate, and 7 = 7.

    Example 2:
    Input: candidates = [2,3,5], target = 8
    Output: [[2,2,2,2],[2,3,3],[3,5]]
    */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, candidates, target, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int index, int[] arr, int target,
                           List<Integer> current, List<List<Integer>> result) {

        // Base case: sum reached
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Out of bounds / exceeded
        if (index == arr.length || target < 0) {
            return;
        }

        // PICK: take arr[index] (you stay at same index because repeat allowed)
        current.add(arr[index]);
        backtrack(index, arr, target - arr[index], current, result);

        // BACKTRACK
        current.remove(current.size() - 1);

        // NOT PICK: move to next index
        backtrack(index + 1, arr, target, current, result);
    }

     
}
