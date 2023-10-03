// 917. Reverse Only Letters

// Given a string s, reverse the string according to the following rules:
// All the characters that are not English letters remain in the same position.
// All the English letters (lowercase or uppercase) should be reversed.
// Return s after reversing it.
// Example 1:
// Input: s = "ab-cd"
// Output: "dc-ba"
// Example 2:
// Input: s = "a-bC-dEf-ghIj"
// Output: "j-Ih-gfE-dCba"
// Example 3:
// Input: s = "Test1ng-Leet=code-Q!"
// Output: "Qedo1ct-eeLg=ntse-T!"
// Constraints:
// 1 <= s.length <= 100
// s consists of characters with ASCII values in the range [33, 122].
// s does not contain '\"' or '\\'.



// Time:O(n/2)
// Space:O(n)
public class Q917_reverse_only_letters {
    public String reverseOnlyLetters(String s) {
        char[] tmp = s.toCharArray();
        int l=0, r=s.length()-1;
        while(l<r){
            if(!Character.isAlphabetic(tmp[l])) l++;
            else if(!Character.isAlphabetic(tmp[r])) r--;
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
