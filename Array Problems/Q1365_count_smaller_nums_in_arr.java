// 1365. How Many Numbers Are Smaller Than the Current Number

// Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you 
// have to count the number of valid j's such that j != i and nums[j] < nums[i].
// Return the answer in an array
// Example 1:
// Input: nums = [8,1,2,2,3]
// Output: [4,0,1,1,3]
// Constraints:
// 2 <= nums.length <= 500
// 0 <= nums[i] <= 100



// Time:O(n*n)
// Space:O(n)
public class Q1365_count_smaller_nums_in_arr {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int[] ans = new int[n];
        int cnt = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(nums[j] < nums[i]) cnt++;
            }
            ans[i] = cnt;
            cnt = 0;
        }

        return ans;
    }
}
