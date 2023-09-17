// 547. Number of Provinces

// There are n cities. Some of them are connected, while some are not. If city a is connected directly with city b,
// and city b is connected directly with city c, then city a is connected indirectly with city c.
// A province is a group of directly or indirectly connected cities and no other cities outside of the group.
// You are given an n x n matrix isConnected where isConnected[i][j] = 1 if the ith city and the jth city are directly connected, and isConnected[i][j] = 0 otherwise.
// Return the total number of provinces.
// Example 1:
// Input: isConnected = [[1,1,0],[1,1,0],[0,0,1]]
// Output: 2
// Example 2:
// Input: isConnected = [[1,0,0],[0,1,0],[0,0,1]]
// Output: 3
// Constraints:
// 1 <= n <= 200
// n == isConnected.length
// n == isConnected[i].length
// isConnected[i][j] is 1 or 0.
// isConnected[i][i] == 1
// isConnected[i][j] == isConnected[j][i]



// Time complexity: O(n*n)
// Space complexity: O(n) -> on the stack
public class Q547_num_of_provinces {
    public void dfs(int[][] m, int[] vis, int i){
        for(int j=0; j<m.length; j++){
            if(m[i][j] == 1 && vis[j] == 0){
                vis[j] = 1;
                dfs(m, vis, j);
            }
        }
    }
    public int findCircleNum(int[][] m) {
        int[] vis = new int[m.length];
        int cnt = 0;
        for(int i=0; i<m.length; i++){
            if(vis[i] == 0){
                dfs(m, vis, i);
                cnt++;
            }
        }
        return cnt;
    }
}
