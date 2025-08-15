package Arrays.Hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class majorityelement {
    
    public static List<Integer> majorityElement1(int[] nums) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (result.contains(nums[i])) continue; // avoid duplicates
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] == nums[i]) count++;
            }
            if (count > n / 3) result.add(nums[i]);
        }
        return result;
    }

    public static List<Integer> majorityElement2(int[]nums){
        int n= nums.length;
        Map<Integer,Integer> freqMap=new HashMap<>();

        for(int num:nums){
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
        }
        List<Integer> result=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:freqMap.entrySet()){
            if(entry.getValue()>n/3){
                result.add(entry.getKey());
            }
        }

        return result;

    }

    //optimal solution 
    public static List<Integer> majorityElement(int[] nums) {
        int count1 = 0, count2 = 0;
        Integer candidate1 = null, candidate2 = null;

        // Step 1: Find candidates
        for (int num : nums) {
            if (candidate1 != null && num == candidate1) {
                count1++;
            } else if (candidate2 != null && num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Step 2: Verify counts
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == candidate1) count1++;
            else if (num == candidate2) count2++;
        }

        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        if (count1 > n / 3) result.add(candidate1);
        if (count2 > n / 3) result.add(candidate2);

        return result;
    }

    public static void main(String[]args){
        int[]nums={1,1,1,2,3,3,3,4,4};
        System.out.println(majorityElement2(nums));
        System.out.println(majorityElement(nums));
    }
}
