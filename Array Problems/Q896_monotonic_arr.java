// 896. Monotonic Array

// An array is monotonic if it is either monotone increasing or monotone decreasing.
// An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].
// Given an integer array nums, return true if the given array is monotonic, or false otherwise.
// Example 1:
// Input: nums = [1,2,2,3]
// Output: true
// Example 2:
// Input: nums = [6,5,4,4]
// Output: true
// Example 3:
// Input: nums = [1,3,2]
// Output: false
// Constraints:
// 1 <= nums.length <= 105
// -105 <= nums[i] <= 105



// Time:O(n)
// Space:O(1)
public class Q896_monotonic_arr {
    public boolean isMonotonic(int[] nums) {
        int i=0,last=nums[0];
        for(;i<nums.length && nums[i]>=last;i++) last=nums[i];
        if(i==nums.length) return true;
        i=0;
        last=nums[0];
        for(;i<nums.length && nums[i]<=last;i++) last=nums[i];
        return i==nums.length;
    }
}
