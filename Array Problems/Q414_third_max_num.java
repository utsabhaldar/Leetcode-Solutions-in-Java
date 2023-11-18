// 414. Third Maximum Number

// Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.
// Example 1:
// Input: nums = [3,2,1]
// Output: 1
// Explanation:
// The first distinct maximum is 3.
// The second distinct maximum is 2.
// The third distinct maximum is 1.
// Constraints:
// 1 <= nums.length <= 104
// -231 <= nums[i] <= 231 - 1
// Follow up: Can you find an O(n) solution?



// Time:O(n)
// Space:O(1)
public class Q414_third_max_num {
    public int thirdMax(int[] nums) {
        long n1 = Long.MIN_VALUE, n2 = Long.MIN_VALUE, n3 = Long.MIN_VALUE;

        for(int i : nums){
            if(i>n1){
                n3 = n2;
                n2 = n1;
                n1 = i;
            }
            else if(i>n2 && i!=n1){
                n3 = n2;
                n2 = i;
            }
            else if(i>n3 && i!=n2 && i!=n1){
                n3 = i;
            }
        }

        return n3 == Long.MIN_VALUE ? (int)n1 : (int)n3;
    }
}
