// 34. Find First and Last Position of Element in Sorted Array

// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

// If target is not found in the array, return [-1, -1].

// You must write an algorithm with O(log n) runtime complexity.

 

// Example 1:

// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]
// Example 2:

// Input: nums = [5,7,7,8,8,10], target = 6
// Output: [-1,-1]
// Example 3:

// Input: nums = [], target = 0
// Output: [-1,-1]
 

// Constraints:

// 0 <= nums.length <= 105
// -109 <= nums[i] <= 109
// nums is a non-decreasing array.
// -109 <= target <= 109



public class Q34_position_of_ele {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0]=arr[1]=-1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                arr[0] = i;
                while(nums.length>i && nums[i+1]==target){
                    i++;
                    arr[1] = i;
                }
            }
        }
        return arr;
    }
}
