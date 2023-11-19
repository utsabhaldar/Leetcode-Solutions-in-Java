// 1887. Reduction Operations to Make the Array Elements Equal

// Given an integer array nums, your goal is to make all elements in nums equal. To complete one operation, follow these steps:
// Find the largest value in nums. Let its index be i (0-indexed) and its value be largest. If there are multiple elements with the largest value, 
// pick the smallest i. Find the next largest value in nums strictly smaller than largest. Let its value be nextLargest. Reduce nums[i] to nextLargest.
// Return the number of operations to make all elements in nums equal.
// Example 1:
// Input: nums = [5,1,3]
// Output: 3
// Explanation: It takes 3 operations to make all elements in nums equal:
// 1. largest = 5 at index 0. nextLargest = 3. Reduce nums[0] to 3. nums = [3,1,3].
// 2. largest = 3 at index 0. nextLargest = 1. Reduce nums[0] to 1. nums = [1,1,3].
// 3. largest = 3 at index 2. nextLargest = 1. Reduce nums[2] to 1. nums = [1,1,1].
// Constraints:
// 1 <= nums.length <= 5 * 104
// 1 <= nums[i] <= 5 * 104



// Time:O(n + n log n)
// Spce:O(1)
import java.util.Arrays;

public class Q1887_reduction_op_equal_ele {
    public int reductionOperations(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int cnt = 0;

        for(int i=n-1; i>0; i--){
            if(nums[i-1] != nums[i]) cnt += n-i;
        }

        return cnt;
    }
}
