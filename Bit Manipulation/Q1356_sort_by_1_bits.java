// 1356. Sort Integers by The Number of 1 Bits

// You are given an integer array arr. Sort the integers in the array in ascending order by the number of 1's in their binary representation and in case of 
// two or more integers have the same number of 1's you have to sort them in ascending order. Return the array after sorting it.
// Example 1:
// Input: arr = [0,1,2,3,4,5,6,7,8]
// Output: [0,1,2,4,8,3,5,6,7]
// Explantion: [0] is the only integer with 0 bits.
// [1,2,4,8] all have 1 bit.
// [3,5,6] have 2 bits.
// [7] has 3 bits.
// The sorted array by bits is [0,1,2,4,8,3,5,6,7]
// Constraints:
// 1 <= arr.length <= 500
// 0 <= arr[i] <= 104


// Time:O(2n + n log n)
// Space:O(1)
import java.util.Arrays;

public class Q1356_sort_by_1_bits {
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        
        for(int i=0; i<n; i++){
            arr[i] += Integer.bitCount(arr[i]) * 10001;
        }

        Arrays.sort(arr);

        for(int i=0; i<n; i++){
            arr[i] = arr[i] % 10001;
        }

        return arr;
    }
}
