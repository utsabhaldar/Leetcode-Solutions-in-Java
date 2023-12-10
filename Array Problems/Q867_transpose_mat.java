// 867. Transpose Matrix

// Given a 2D integer array matrix, return the transpose of matrix.
// The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
// Example 1:
// Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
// Output: [[1,4,7],[2,5,8],[3,6,9]]
// Constraints:
// m == matrix.length
// n == matrix[i].length
// 1 <= m, n <= 1000
// 1 <= m * n <= 105
// -109 <= matrix[i][j] <= 109



// Time:O(n*m)
// Space:O(n)
public class Q867_transpose_mat {
    public int[][] transpose(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int[][] ans = new int[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                ans[i][j] = mat[j][i];
            }
        }

        return ans;
    }
}
