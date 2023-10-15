// 746. Min Cost Climbing Stairs

// You are given an integer array cost where cost[i] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.
// You can either start from the step with index 0, or the step with index 1.
// Return the minimum cost to reach the top of the floor.
// Example 1:
// Input: cost = [10,15,20]
// Output: 15
// Explanation: You will start at index 1.
// - Pay 15 and climb two steps to reach the top.
// The total cost is 15.
// Example 2:
// Input: cost = [1,100,1,1,1,100,1,1,100,1]
// Output: 6
// Constraints:
// 2 <= cost.length <= 1000
// 0 <= cost[i] <= 999



// Time:O(n)
// Space:O(1)
public class Q746_min_cost_climbing_stairs {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length ;
        for(int i=2 ; i<n ; i++){
            cost[i] += Math.min(cost[i-1] , cost[i-2]);
        }
        return Math.min(cost[n-1] , cost[n-2]);
    }
}
