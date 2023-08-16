// 415. Add Strings

// Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.

// You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.

 

// Example 1:

// Input: num1 = "11", num2 = "123"
// Output: "134"
// Example 2:

// Input: num1 = "456", num2 = "77"
// Output: "533"
// Example 3:

// Input: num1 = "0", num2 = "0"
// Output: "0"
 

// Constraints:

// 1 <= num1.length, num2.length <= 104
// num1 and num2 consist of only digits.
// num1 and num2 don't have any leading zeros except for the zero itself.




// Optimal approach


public class Q415_add_strings  {
    public String addStrings(String num1, String num2) {
        return add(num1, num2);
    }
    String add(String num1, String num2)
    {
        
        // Make num1 the longer number
        if (num1.length() < num2.length()) {
            String temp = num1;
            num1 = num2;
            num2 = temp;
        }

        StringBuilder result = new StringBuilder();
        int carry = 0;
        int diff = num1.length() - num2.length();

        // Perform addition digit-by-digit
        for (int i = num1.length() - 1; i >= 0; i--) {
            int digit1 = num1.charAt(i) - '0';
            int digit2 = i - diff >= 0 ? num2.charAt(i - diff) - '0' : 0;
            int sum = digit1 + digit2 + carry;
            result.append(sum % 10);
            carry = sum / 10;
        }

        // Add the final carry if necessary
        if (carry != 0) {
            result.append(carry);
        }

        // Reverse the result and return it
        return result.reverse().toString();
    }
}



// public class Q415_add_strings {
//     public String addStrings(String num1, String num2) {

        // approach 1

        // java.math.BigInteger a = new java.math.BigInteger(num1);
        // java.math.BigInteger b = new java.math.BigInteger(num2);
        // a = a.add(b);
        // return a.toString();

//      }
// }
