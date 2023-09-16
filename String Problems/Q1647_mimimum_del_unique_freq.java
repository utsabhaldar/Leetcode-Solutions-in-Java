// 1647. Minimum Deletions to Make Character Frequencies Unique

// A string s is called good if there are no two different characters in s that have the same frequency.
// Given a string s, return the minimum number of characters you need to delete to make s good.
// The frequency of a character in a string is the number of times it appears in the string. For example, in the string "aab", the frequency of 'a' is 2, while the frequency of 'b' is 1.

// Example 1:
// Input: s = "aab"
// Output: 0
// Explanation: s is already good.
// Example 2:
// Input: s = "aaabbbcc"
// Output: 2
// Explanation: You can delete two 'b's resulting in the good string "aaabcc".
// Another way it to delete one 'b' and one 'c' resulting in the good string "aaabbc".
// Example 3:
// Input: s = "ceabaacb"
// Output: 2
// Explanation: You can delete both 'c's resulting in the good string "eabaab".
// Note that we only care about characters that are still in the string at the end (i.e. frequency of 0 is ignored).

// Constraints:
// 1 <= s.length <= 105
// s contains only lowercase English letters.



// Time: O(n); note that the second loop will not have more than 26 * 26 total operations.
// Memory: O(1) as we will not store more than 26 different frequencies.

import java.util.HashSet;
import java.util.Set;

public class Q1647_mimimum_del_unique_freq {
    public int minDeletions(String s) {
        int cnt[] = new int[26], ans = 0;
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<s.length(); i++)
            ++cnt[s.charAt(i)-'a'];
        for(int i=0; i< 26; i++){
            while(cnt[i]>0 && !set.add(cnt[i])){
                cnt[i]--; ans++;
            }
        }
        return ans;
    }
}
