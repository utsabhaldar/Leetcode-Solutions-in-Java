// 2929. Distribute Candies Among Children II

// You are given two positive integers n and limit.
// Return the total number of ways to distribute n candies among 3 children such that no child gets more than limit candies.
// Example 1:
// Input: n = 5, limit = 2
// Output: 3
// Explanation: There are 3 ways to distribute 5 candies such that no child gets more than 2 candies: (1, 2, 2), (2, 1, 2) and (2, 2, 1).
// Constraints:
// 1 <= n <= 106
// 1 <= limit <= 106



// Time:O(1)
// Time:O(1)
public class Q2929_distribute_candies {
    public long distributeCandies(int n, int limit) {
        long ans = comb2(n + 2);

        if (n > 3 * limit) return 0;
        if (n > limit) {
            ans -= 3 * comb2(n - limit + 1);
        }
        if (n - 2 >= 2 * limit) {
            ans += 3 * comb2(n - 2 * limit);
        }
        
        return ans;
    }
    
    public static long comb2(int x) {
        return (long)x * (x - 1) / 2;
    }
}
