// 2903. Find Indices With Index and Value Difference I

// You are given a 0-indexed integer array nums having length n, an integer indexDifference, and an integer valueDifference.
// Your task is to find two indices i and j, both in the range [0, n - 1], that satisfy the following conditions:
// abs(i - j) >= indexDifference, and
// abs(nums[i] - nums[j]) >= valueDifference
// Return an integer array answer, where answer = [i, j] if there are two such indices, and answer = [-1, -1] otherwise. If there are multiple choices for the two indices, return any of them.
// Note: i and j may be equal.
// Example 1:
// Input: nums = [5,1,4,1], indexDifference = 2, valueDifference = 4
// Output: [0,3]
// Explanation: In this example, i = 0 and j = 3 can be selected.
// abs(0 - 3) >= 2 and abs(nums[0] - nums[3]) >= 4.
// Hence, a valid answer is [0,3].
// [3,0] is also a valid answer.
// Constraints:
// 1 <= n == nums.length <= 100
// 0 <= nums[i] <= 50
// 0 <= indexDifference <= 100
// 0 <= valueDifference <= 50



// Time:O(n)
// Space:O(1)
public class Q2903_indices_with_index_val_diff {
    public int[] findIndices(int[] A, int d, int v) {
        int mini = 0, maxi = 0, n = A.length;
        for (int i = d; i < n; i++) {
            if (A[i - d] < A[mini]) mini = i - d;
            if (A[i - d] > A[maxi]) maxi = i - d;
            if (A[i] - A[mini] >= v) return new int[] {mini, i};
            if (A[maxi] - A[i] >= v) return new int[] {maxi, i};
        }
        return new int[] { -1, -1};
    }
}
