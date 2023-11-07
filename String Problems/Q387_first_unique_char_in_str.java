// 387. First Unique Character in a String

// Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
// Example:
// Input: s = "leetcode"
// Output: 0
// Constraints:
// 1 <= s.length <= 105
// s consists of only lowercase English letters.



// Time:O(n)
// Space:O(1)
public class Q387_first_unique_char_in_str {
    public int firstUniqChar(String s) {
        int index = -1, lastInd = -1;
        int ans = Integer.MAX_VALUE;
        
        for(char c='a'; c<='z'; c++){
            index = s.indexOf(c);
            lastInd = s.lastIndexOf(c);

            if(index!=-1 && index == lastInd) ans = Math.min(ans, index);
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
