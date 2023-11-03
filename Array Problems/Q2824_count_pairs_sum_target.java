// 2824. Count Pairs Whose Sum is Less than Target

// Given a 0-indexed integer array nums of length n and an integer target, return the number of pairs (i, j) where 0 <= i < j < n and nums[i] + nums[j] < target.
// Example 1:
// Input: nums = [-1,1,2,3,1], target = 2
// Output: 3
// Explanation: There are 3 pairs of indices that satisfy the conditions in the statement:
// - (0, 1) since 0 < 1 and nums[0] + nums[1] = 0 < target
// - (0, 2) since 0 < 2 and nums[0] + nums[2] = 1 < target 
// - (0, 4) since 0 < 4 and nums[0] + nums[4] = 0 < target
// Note that (0, 3) is not counted since nums[0] + nums[3] is not strictly less than the target.
// Constraints:
// 1 <= nums.length == n <= 50
// -50 <= nums[i], target <= 50



// Time:O(n*n)
// Space:O(1)
import java.util.List;

public class Q2824_count_pairs_sum_target {
    public int countPairs(List<Integer> nums, int target) {
        int n = nums.size();
        int cnt = 0;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nums.get(i) + nums.get(j) < target) cnt++;
            }
        }

        return cnt;
    }
}
