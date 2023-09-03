// 2418. Sort the People

// You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.

// For each index i, names[i] and heights[i] denote the name and height of the ith person.

// Return names sorted in descending order by the people's heights.

// Example 1:
// Input: names = ["Mary","John","Emma"], heights = [180,165,170]
// Output: ["Mary","Emma","John"]
// Explanation: Mary is the tallest, followed by Emma and John.
// Example 2:

// Input: names = ["Alice","Bob","Bob"], heights = [155,185,150]
// Output: ["Bob","Alice","Bob"]
// Explanation: The first Bob is the tallest, followed by Alice and the second Bob.
 
// Constraints:
// n == names.length == heights.length
// 1 <= n <= 103
// 1 <= names[i].length <= 20
// 1 <= heights[i] <= 105
// names[i] consists of lower and upper case English letters.
// All the values of heights are distinct.



// Time:O(2n + nlogn)
// Space:O(2n)
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class Q2418_sort_the_people {
    public String[] sortPeople(String[] n, int[] h) {
        int l=h.length;
        Map<Integer,String> map=new HashMap<>();
        for(int i=0;i<l;i++)
            map.put(h[i],n[i]);
        Arrays.sort(h);
        String[] ans=new String[l];
        int j=0;
        for(int i=l-1;i>=0;i--){
            ans[j]=map.get(h[i]);
            j++;
            }
    return ans;
    }
}
