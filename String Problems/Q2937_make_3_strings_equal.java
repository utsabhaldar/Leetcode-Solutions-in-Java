// 2937. Make Three Strings Equal

// You are given three strings s1, s2, and s3. You have to perform the following operation on these three strings as many times as you want.
// In one operation you can choose one of these three strings such that its length is at least 2 and delete the rightmost character of it.
// Return the minimum number of operations you need to perform to make the three strings equal if there is a way to make them equal, otherwise, return -1.
// Example 1:
// Input: s1 = "abc", s2 = "abb", s3 = "ab"
// Output: 2
// Explanation: Performing operations on s1 and s2 once will lead to three equal strings.
// It can be shown that there is no way to make them equal with less than two operations.
// Constraints:
// 1 <= s1.length, s2.length, s3.length <= 100
// s1, s2 and s3 consist only of lowercase English letters.



// Time:O(n)
// Space:O(1)
public class Q2937_make_3_strings_equal {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int a = s1.length();        
        int b = s2.length();
        int c = s3.length();

        int i = 0;
        int min = Math.min(a, Math.min(b,c));
        
        while(i<min && s1.charAt(i) == s2.charAt(i) && s2.charAt(i) == s3.charAt(i)){
                i++;
            }
        
        int sum = (a-i) + (b-i) + (c-i);
        
        return i==0 ? -1 : sum;
    }
}
