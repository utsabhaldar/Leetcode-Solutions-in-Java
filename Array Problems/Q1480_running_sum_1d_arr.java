// 1480. Running Sum of 1d Array

// Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
// Return the running sum of nums.
// Example 1:
// Input: nums = [1,2,3,4]
// Output: [1,3,6,10]
// Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
// Constraints:
// 1 <= nums.length <= 1000
// -10^6 <= nums[i] <= 10^6



// Time:O(n)
// Space:O(1)
public class Q1480_running_sum_1d_arr {
    public int[] runningSum(int[] nums) {
        int n=nums.length;

        for(int i=1; i<n; i++){
            nums[i] += nums[i-1];
        }

        return nums;
    }
}
