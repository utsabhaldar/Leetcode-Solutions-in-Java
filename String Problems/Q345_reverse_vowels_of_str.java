// 345. Reverse Vowels of a String

// Given a string s, reverse only all the vowels in the string and return it.
// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
// Example 1:
// Input: s = "hello"
// Output: "holle"
// Example 2:
// Input: s = "leetcode"
// Output: "leotcede"
// Constraints:
// 1 <= s.length <= 3 * 105
// s consist of printable ASCII characters.



// Time:O(n/2)
// String:O(1)
public class Q345_reverse_vowels_of_str {
    public String reverseVowels(String s) {
        char[] tmp = s.toCharArray();
        int l=0, r=s.length()-1;
        while(l<r){

            if(tmp[l] != 'a' && tmp[l] != 'e' && tmp[l] != 'i' && tmp[l] != 'o' && tmp[l] != 'u'
                && tmp[l] != 'A' && tmp[l] != 'E'&& tmp[l] != 'I' && tmp[l] != 'O' && tmp[l] != 'U') 
                l++;

            else if(tmp[r] != 'a' && tmp[r] != 'e' && tmp[r] != 'i' && tmp[r] != 'o' && tmp[r] != 'u'
                    && tmp[r] != 'A' && tmp[r] != 'E' && tmp[r] != 'I' && tmp[r] != 'O' && tmp[r] != 'U')
                r--;

            else{
                char i = tmp[l];
                tmp[l] = tmp[r];
                tmp[r] = i;
                l++; r--;
            }
        }
        return String.valueOf(tmp);
    }
}
