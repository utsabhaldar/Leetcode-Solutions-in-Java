// 1672. Richest Customer Wealth

// You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
// A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
// Example 1:
// Input: accounts = [[1,2,3],[3,2,1]]
// Output: 6
// Explanation:
// 1st customer has wealth = 1 + 2 + 3 = 6
// 2nd customer has wealth = 3 + 2 + 1 = 6
// Both customers are considered the richest with a wealth of 6 each, so return 6.
// Constraints:
// m == accounts.length
// n == accounts[i].length
// 1 <= m, n <= 50
// 1 <= accounts[i][j] <= 100


// Time:O(n*n)
// Space:O(1)
public class Q1672_richest_customer_wealth {
    public int maximumWealth(int[][] ac) {
        int max = 0;

        for(int i=0; i<ac.length; i++){
            int sum = 0;
            for(int j=0; j<ac[i].length; j++){
                sum += ac[i][j];
            }
            max = Math.max(sum, max);
        }

        return max;
    }
}
