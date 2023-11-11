// 205. Isomorphic Strings

// Given two strings s and t, determine if they are isomorphic.
// Two strings s and t are isomorphic if the characters in s can be replaced to get t.
// All occurrences of a character must be replaced with another character while preserving the order of characters. 
// No two characters may map to the same character, but a character may map to itself.
// Example 1:
// Input: s = "egg", t = "add"
// Output: true
// Constraints:
// 1 <= s.length <= 5 * 104
// t.length == s.length
// s and t consist of any valid ascii character.


// Time:O(n)
// Space:O(n)
import java.util.HashMap;
import java.util.Map;
public class Q205_isomorphic_string {
    public boolean isIsomorphic(String s, String t) {

        Map<Character, Character> mp = new HashMap<>();
        int n=s.length();
        
        if(n!=t.length()) return false;
        
        for(int i=0; i<n; i++){
            if(mp.containsKey(s.charAt(i))){
                if(!mp.get(s.charAt(i)).equals(t.charAt(i))){
                    return false;
                }
            }
            else{
                if(mp.containsValue(t.charAt(i))){
                    return false;
                }
                mp.put(s.charAt(i), t.charAt(i));
            }
        }
        
        return true;
    }
}
