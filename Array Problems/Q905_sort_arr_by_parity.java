// 905. Sort Array By Parity

// Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
// Return any array that satisfies this condition.
// Example 1:
// Input: nums = [3,1,2,4]
// Output: [2,4,3,1]
// Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
// Example 2:
// Input: nums = [0]
// Output: [0]
// Constraints:
// 1 <= nums.length <= 5000
// 0 <= nums[i] <= 5000



// Time:O(n)
// Space:O(1)
public class Q905_sort_arr_by_parity {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int l = 0, r = n-1;
        while(l<r){
            while(l<r && nums[l] %2 == 0) l++;
            while(l<r && nums[r] %2 == 1) r--;
            int tmp = nums[l];
            nums[l] = nums[r];
            nums[r] = tmp;
        }
        return nums;
    }
}
