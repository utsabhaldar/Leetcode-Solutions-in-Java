// 1337. The K Weakest Rows in a Matrix

// You are given an m x n binary matrix mat of 1's (representing soldiers) and 0's (representing civilians). 
// The soldiers are positioned in front of the civilians. That is, all the 1's will appear to the left of all the 0's in each row.
// A row i is weaker than a row j if one of the following is true:
// The number of soldiers in row i is less than the number of soldiers in row j.
// Both rows have the same number of soldiers and i < j.
// Return the indices of the k weakest rows in the matrix ordered from weakest to strongest.
// Example 1:
// Input: mat = 
// [[1,1,0,0,0],
//  [1,1,1,1,0],
//  [1,0,0,0,0],
//  [1,1,0,0,0],
//  [1,1,1,1,1]], 
// k = 3
// Output: [2,0,3]
// Explanation: 
// The number of soldiers in each row is: 
// - Row 0: 2 
// - Row 1: 4 
// - Row 2: 1 
// - Row 3: 2 
// - Row 4: 5 
// The rows ordered from weakest to strongest are [2,0,3,1,4].
// Example 2:
// Input: mat = 
// [[1,0,0,0],
//  [1,1,1,1],
//  [1,0,0,0],
//  [1,0,0,0]], 
// k = 2
// Output: [0,2]
// Explanation: 
// The number of soldiers in each row is: 
// - Row 0: 1 
// - Row 1: 4 
// - Row 2: 1 
// - Row 3: 1 
// The rows ordered from weakest to strongest are [0,2,3,1].
// Constraints:
// m == mat.length
// n == mat[i].length
// 2 <= n, m <= 100
// 1 <= k <= m
// matrix[i][j] is either 0 or 1.



// Time:O(n*logn)
// Space:O(n)
public class Q1337_k_weak_rows_in_mat {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] soldiers = new int[mat.length];
        for (int i = 0; i < mat.length; i++) {
            soldiers[i] = ceil(mat[i]);
        }
        int[] weakOrder = new int[k];
        for (int i = 0; i < k; i++) {
            int min = find(soldiers);
            soldiers[min] = -1;
            weakOrder[i] = min;
        }
        return weakOrder;
    }
    static int ceil(int[] row){
        int start = 0;
        int end = row.length-1;
        while (start <= end){
            int mid = start + (end - start)/2;
            if(row[mid] < 1) end = mid - 1;
            else start = mid +1;
        }
        return start;
    }
    static int find(int[] arr) {
        int least = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] < least) {
                least = arr[i];
                index = i;
            }
        }
        return index;
    }
}
