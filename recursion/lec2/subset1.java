package recursion.lec2;

import java.util.ArrayList;
import java.util.List;

public class subset1 {
     static void helper(int index, int currentSum, int[] nums, List<Integer> ans) {
        // Base Case: when index reaches end
        if (index == nums.length) {
            ans.add(currentSum);
            return;
        }

        // Include nums[index]
        helper(index + 1, currentSum + nums[index], nums, ans);

        // Exclude nums[index]
        helper(index + 1, currentSum, nums, ans);
    }

    public static List<Integer> subsetSums(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        helper(0, 0, nums, ans);
        return ans;
    }

    

}
