// 977. Squares of a Sorted Array

// Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
// Example 1:
// Input: nums = [-4,-1,0,3,10]
// Output: [0,1,9,16,100]
// Explanation: After squaring, the array becomes [16,1,0,9,100].
// After sorting, it becomes [0,1,9,16,100].
// Constraints:
// 1 <= nums.length <= 104
// -104 <= nums[i] <= 104
// nums is sorted in non-decreasing order.
// Follow up: Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?



// Time:O(n)
// Space:O(n)
public class Q977_squares_of_sorted_arr {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int i=0, j=n-1;
        int[] ans = new int[n];
        int pos = n-1;

        while(i<=j){
            if(Math.abs(nums[i]) > Math.abs(nums[j])){
                ans[pos] = nums[i]*nums[i];
                i++;
                pos--;
            }
            else{
                ans[pos] = nums[j]*nums[j];
                j--;
                pos--;
            }
        }
        return ans;
    }
}
