// 2961. Double Modular Exponentiation

// You are given a 0-indexed 2D array variables where variables[i] = [ai, bi, ci, mi], and an integer target. An index i is good if the following formula holds:
// 0 <= i < variables.length ((aibi % 10)ci) % mi == target Return an array consisting of good indices in any order.
// Example 1:
// Input: variables = [[2,3,3,10],[3,3,3,1],[6,1,1,4]], target = 2
// Output: [0,2]
// Explanation: For each index i in the variables array:
// 1) For the index 0, variables[0] = [2,3,3,10], (23 % 10)3 % 10 = 2.
// 2) For the index 1, variables[1] = [3,3,3,1], (33 % 10)3 % 1 = 0.
// 3) For the index 2, variables[2] = [6,1,1,4], (61 % 10)1 % 4 = 2.
// Therefore we return [0,2] as the answer.
// Constraints: 1 <= variables.length <= 100, variables[i] == [ai, bi, ci, mi], 1 <= ai, bi, ci, mi <= 103, 0 <= target <= 103



// Time:O(n)
// Space:O(n)
import java.util.ArrayList;
import java.util.List;

public class Q2961_double_mod_exponentiation {
    public List<Integer> getGoodIndices(int[][] var, int tar) {
        List<Integer> ans = new ArrayList<>();
        
        for (int i = 0; i < var.length; i++) {
            int a = var[i][0];
            int b = var[i][1];
            int c = var[i][2];
            int d = var[i][3];

            int tmp = modPow(a, b, 10);
            int tmp2 = modPow(tmp, c, d);

            if (tmp2 == tar) {
                ans.add(i);
            }
        }

        return ans;
    }

    private int modPow(int base, int exponent, int mod) {
        int result = 1;
        base %= mod;

        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % mod;
            }
            exponent /= 2;
            base = (base * base) % mod;
        }

        return result;
    }
}
