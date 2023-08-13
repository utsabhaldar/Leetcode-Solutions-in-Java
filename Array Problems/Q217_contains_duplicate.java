// 217. Contains Duplicate

// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

// Example 1:

// Input: nums = [1,2,3,1]
// Output: true
// Example 2:

// Input: nums = [1,2,3,4]
// Output: false
// Example 3:

// Input: nums = [1,1,1,3,3,4,3,2,4,2]
// Output: true
 

// Constraints:

// 1 <= nums.length <= 105
// -109 <= nums[i] <= 109




import java.util.HashSet;

public class Q217_contains_duplicate {
    public boolean containsDuplicate(int[] nums) {

        // Approach 1 - sorting
        // Time complexity: O(n log n)
        // Space complexity: O(1)

        // Arrays.sort(nums);
        // for(int i=1; i<nums.length; i++){
        // if(nums[i] == nums[i-1]) return true;
        // }
        // return false;

        // Optimised approach - HashSet
        // Time complexity: O(n)
        // Space complexity: O(1)
        
        HashSet<Integer> hs = new HashSet<>();
        for(int num: nums){
        if(hs.contains(num)) return true;
        hs.add(num);
        }
        return false;
    }
}
