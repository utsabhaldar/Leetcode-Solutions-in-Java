// 2932. Maximum Strong Pair XOR I

// You are given a 0-indexed integer array nums. A pair of integers x and y is called a strong pair if it satisfies the condition:
// |x - y| <= min(x, y)
// You need to select two integers from nums such that they form a strong pair and their bitwise XOR is the maximum among all strong pairs in the array.
// Return the maximum XOR value out of all possible strong pairs in the array nums.
// Note that you can pick the same integer twice to form a pair.
// Example 1:
// Input: nums = [1,2,3,4,5]
// Output: 7
// Explanation: There are 11 strong pairs in the array nums: (1, 1), (1, 2), (2, 2), (2, 3), (2, 4), (3, 3), (3, 4), (3, 5), (4, 4), (4, 5) and (5, 5).
// The maximum XOR possible from these pairs is 3 XOR 4 = 7.
// Constraints:
// 1 <= nums.length <= 50
// 1 <= nums[i] <= 100



// Time:O(n*n)
// Space:O(1)
public class Q2932_max_strong_pair_XOR_I {
    public int maximumStrongPairXor(int[] nums) {
        int n=nums.length;
        int max = 0;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int x = nums[i], y = nums[j];
                if(Math.abs(x-y) <= Math.min(x, y)){
                    max = Math.max(max, x^y);
                }
            }
        }
        
        return max;
    }
}
