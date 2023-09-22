// 4. Median of Two Sorted Arrays

// Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
// The overall run time complexity should be O(log (m+n)).
// Example 1:
// Input: nums1 = [1,3], nums2 = [2]
// Output: 2.00000
// Explanation: merged array = [1,2,3] and median is 2.
// Example 2:
// Input: nums1 = [1,2], nums2 = [3,4]
// Output: 2.50000
// Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
// Constraints:
// nums1.length == m
// nums2.length == n
// 0 <= m <= 1000
// 0 <= n <= 1000
// 1 <= m + n <= 2000
// -106 <= nums1[i], nums2[i] <= 106package 



// Time:O(n+m) -> n and m are length of those arrays
// Space:O(n+m)
public class Q4_median_two_sorted_arr {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;int j=0;
        int s=nums1.length+nums2.length;
        int arr[]=new int[s];int k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                arr[k]=nums1[i];
                k++; i++;
            }
            else{
                arr[k]=nums2[j];
                k++; j++;
            }
        }
        while(i<nums1.length){
            arr[k]=nums1[i];
            k++; i++;
        }
        while(j<nums2.length){
            arr[k]=nums2[j];
            k++; j++;
        }
        double f=0;
        if(arr.length%2==0){
            int d=arr.length/2;
            f=(arr[d]+arr[d-1])/(double)2;
            return f;
        }
        f=arr[arr.length/2];
        return f;
    }
}
