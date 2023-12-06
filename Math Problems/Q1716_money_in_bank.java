// 1716. Calculate Money in Leetcode Bank

// Hercy wants to save money for his first car. He puts money in the Leetcode bank every day.
// He starts by putting in $1 on Monday, the first day. Every day from Tuesday to Sunday, he will put in $1 more than the day before. On every subsequent Monday, 
// he will put in $1 more than the previous Monday. Given n, return the total amount of money he will have in the Leetcode bank at the end of the nth day.
// Example 1:
// Input: n = 4
// Output: 10
// Explanation: After the 4th day, the total is 1 + 2 + 3 + 4 = 10.
// Explanation: After the 20th day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4 + 5 + 6 + 7 + 8) + (3 + 4 + 5 + 6 + 7 + 8) = 96.
// Constraints: 1 <= n <= 1000


// Time:O(1)
// Space:O(1)
public class Q1716_money_in_bank {
    public int totalMoney(int n) {
        int m = n / 7;
        int rem = n % 7;
        
        int total = ((m * (m - 1)) / 2) * 7;
        total += m * 28;
        total += ((rem * (rem + 1)) / 2) + (m * rem);
        
        return total;
    }
}
