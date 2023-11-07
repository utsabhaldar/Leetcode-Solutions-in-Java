// 29. Divide Two Integers

// Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.
// The integer division should truncate toward zero, which means losing its fractional part. For example, 8.345 would be truncated to 8,
// and -2.7335 would be truncated to -2.
// Return the quotient after dividing dividend by divisor.
// Note: Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−231, 231 − 1]. For this 
// problem, if the quotient is strictly greater than 231 - 1, then return 231 - 1, and if the quotient is strictly less than -231, then return -231.
// Example 1:
// Input: dividend = 10, divisor = 3
// Output: 3
// Explanation: 10/3 = 3.33333.. which is truncated to 3.



// Time:O(log n*n)
// Space:O(1)
public class Q29_devide_two_int {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        boolean sign = (dividend>=0) == (divisor>=0) ?true:false;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        int ans = 0;
        while(dividend - divisor >= 0){
            int cnt = 0;
            while(dividend - (divisor << 1 << cnt) >= 0) cnt++;
        ans += 1 << cnt;
        dividend -= divisor << cnt;
        }
        return sign?ans: -ans;
    }
}
