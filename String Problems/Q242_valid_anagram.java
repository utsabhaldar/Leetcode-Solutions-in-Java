// 242. Valid Anagram

// Companies
// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

// Example 1:

// Input: s = "anagram", t = "nagaram"
// Output: true
// Example 2:

// Input: s = "rat", t = "car"
// Output: false
 

// Constraints:

// 1 <= s.length, t.length <= 5 * 104
// s and t consist of lowercase English letters.
 

// Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?



public class Q242_valid_anagram {
        public boolean isAnagram(String s, String t) {
            int count[] = new int[26];
            if(s.length()!=t.length()){
                return false;
            }
            else{
                for(int i=0; i<s.length(); i++){
                    count[s.charAt(i) - 'a']++;
                }
                for(int i=0; i<t.length(); i++){
                    count[t.charAt(i) - 'a']--;
                }
                for(int i=0; i<count.length; i++){
                    if(count[i]!=0) return false;
                }
            }
            return true;
        }
}
