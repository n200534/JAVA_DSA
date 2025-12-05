package recursion.lec2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//subsets with duplicates
public class subsetsum2 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); // sort to handle duplicates easily
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current)); // always add current subset

        for (int i = index; i < nums.length; i++) {

            // Skip duplicates at the same recursion depth
            if (i > index && nums[i] == nums[i - 1])
                continue;

            current.add(nums[i]);
            backtrack(i + 1, nums, current, result);
            current.remove(current.size() - 1);  // backtrack
        }
    }
}
