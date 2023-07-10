// 7. Reverse integer

// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

// Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

// Example 1:

// Input: x = 123
// Output: 321
// Example 2:

// Input: x = -123
// Output: -321
// Example 3:

// Input: x = 120
// Output: 21
 

// Constraints:

// -231 <= x <= 231 - 1



public class Q7_reverse_integer{
    public int reverseInteger(int x) {
        int rev = 0;
        while(x != 0){

            if((long)rev*10 + x%10>= Integer.MAX_VALUE || (long)rev*10 + x%10<= Integer.MIN_VALUE){
                return 0;
            }else{
                rev = rev*10 + x%10;
            x = x/10;
        }
        }
        return rev;
    }
}