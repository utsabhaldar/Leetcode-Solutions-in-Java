// 287. Find the Duplicate Number

// Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

// There is only one repeated number in nums, return this repeated number.

// You must solve the problem without modifying the array nums and uses only constant extra space.

 

// Example 1:

// Input: nums = [1,3,4,2,2]
// Output: 2
// Example 2:

// Input: nums = [3,1,3,4,2]
// Output: 3
 

// Constraints:

// 1 <= n <= 105
// nums.length == n + 1
// 1 <= nums[i] <= n
// All the integers in nums appear only once except for precisely one integer which appears two or more times.




public class Q287_find_duplicate_num {
    public int findDuplicate(int[] nums) {

        // Time Complexity: O(nlogn)O(nlogn)O(nlogn)
        // Space Complexity: O(logn)O(logn)O(logn)

        // Arrays.sort(nums);
        // for (int i=0; i<nums.length; i++){
        //     if(nums[i]==nums[i+1]){
        //             return nums[i];
        //         }
        // }

        // Time Complexity: O(n)
        // Space Complexity: O(1)

        for (int num : nums) {
            int idx = Math.abs(num);
            if (nums[idx] < 0) {
                return idx;
            }
            nums[idx] = -nums[idx];
        }
        return 0;
    }
}
