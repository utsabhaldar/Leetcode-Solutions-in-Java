// 1822. Sign of the Product of an Array

// There is a function signFunc(x) that returns:
// 1 if x is positive.
// -1 if x is negative.
// 0 if x is equal to 0.
// You are given an integer array nums. Let product be the product of all values in the array nums.
// Return signFunc(product).
// Example 1:
// Input: nums = [-1,-2,-3,-4,3,2,1]
// Output: 1
// Explanation: The product of all values in the array is 144, and signFunc(144) = 1
// Constraints:
// 1 <= nums.length <= 1000
// -100 <= nums[i] <= 100



// Time:O(n)
// Space:O(1)
public class Q1822_sign_of_product {
    public int arraySign(int[] nums) {
        int n=nums.length;
        int cnt = 0;

        for(int i=0; i<n; i++){
            if(nums[i]==0) return 0;
            if(nums[i]<0) cnt++;
        }

        if(cnt%2 == 0) return 1;
        return -1;
    }
}
