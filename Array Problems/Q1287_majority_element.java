// 1287. Element Appearing More Than 25% In Sorted Array

// Given an integer array sorted in non-decreasing order, there is exactly one integer in the array that occurs more than 25% of the time, return that integer.
// Example 1:
// Input: arr = [1,2,2,6,6,6,6,7,10]
// Output: 6
// Constraints:
// 1 <= arr.length <= 104
// 0 <= arr[i] <= 105


// Time:O(n)
// Space:O(1)
public class Q1287_majority_element {
    public int findSpecialInteger(int[] arr) {
        int n=arr.length;
        int qtr = n/4;

        for (int i = 0; i < n - qtr; i++) {
            if (arr[i] == arr[i + qtr]) {
                return arr[i];
            }
        }

        return 0;
    }
}
