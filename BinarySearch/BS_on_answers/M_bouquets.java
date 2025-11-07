package BinarySearch.BS_on_answers;

public class M_bouquets {
    //Minimum number of days to make m bouquets
    //problem statement: https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/description/
    //brute force approach will be to check for each k from 1 to max(piles) and check if k is valid or not
    public static int findMax(int[] v) {
        int maxi = Integer.MIN_VALUE;;
        int n = v.length;
        //find the maximum:
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, v[i]);
        }
        return maxi;
    }

    public static boolean isPossible(int[] bloomDay, int day, int m, int k) {
        int n = bloomDay.length;
        int count = 0;
        int bouquet = 0;

        for (int i = 0; i < n; i++) {
            if (bloomDay[i] <= day) {
                count++;
                if (count == k) {
                    bouquet++;
                    count = 0;
                }
            } else {
                count = 0;
            }
            if (bouquet >= m) {
                return true;
            }
        }
        return false;
    }

    public static int minDays(int[] bloomDay, int m, int k) {
        //Find the maximum number:
        int maxi = findMax(bloomDay);

        //Find the minimum value of k:
        for (int i = 1; i <= maxi; i++) {
            if (isPossible(bloomDay, i, m, k)) {
                return i;
            }
        }

        //dummy return statement
        return -1;
    }


    //optimal approach using binary search:
     public static int minDaysoptimal(int[] bloomDay, int m, int k) {
        int low = 1, high = findMax(bloomDay);

        //apply binary search:
        while (low <= high) {
            int mid = (low + high) / 2;
            if (isPossible(bloomDay, mid, m, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    } 
}
