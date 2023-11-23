// 1630. Arithmetic Subarrays

// A sequence of numbers is called arithmetic if it consists of at least two elements, and the difference between every two consecutive elements is the same. 
// More formally, a sequence s is arithmetic if and only if s[i+1] - s[i] == s[1] - s[0] for all valid i.
// For example, these are arithmetic sequences: 1, 3, 5, 7, 9             The following sequence is not arithmetic: 1, 1, 2, 5, 7
// You are given an array of n integers, nums, and two arrays of m integers each, l and r, representing the m range queries, where the ith query is the range [l[i], 
// r[i]]. All the arrays are 0-indexed. Return a list of boolean elements answer, where answer[i] is true if the subarray nums[l[i]], nums[l[i]+1], ... , 
// nums[r[i]] can be rearranged to form an arithmetic sequence, and false otherwise.
// Example 1:
// Input: nums = [4,6,5,9,3,7], l = [0,0,2], r = [2,3,5]
// Output: [true,false,true]
// Constraints: n == nums.length, m == l.length, m == r.length, 2 <= n <= 500, 1 <= m <= 500,  0 <= l[i] < r[i] < n ,  -105 <= nums[i] <= 105

// Time:O(n * (m + (m log m)))     [m= sum of all lengths of subarrays]
// Space:O(m)
import java.util.*;
public class Q1630_arithmetic_subarray {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans = new ArrayList<>();

        for(int i=0; i<l.length; i++){
            ans.add(check(nums, l[i], r[i]));
        }

        return ans;
    }

    public Boolean check(int[] nums, int st, int end){
        int[] a = new int[end-st+1];

        int pos=0;
        for(int i=st; i<=end; i++){
            a[pos++] = nums[i];
        }

        Arrays.sort(a);
        int diff = a[1] - a[0];
        
        for(int i=1; i<a.length; i++){
            if(a[i] - a[i-1] != diff) return false;
        }

        return true;
    }
}
