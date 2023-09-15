// 1922. Count Good Numbers

// A digit string is good if the digits (0-indexed) at even indices are even and the digits at odd indices are prime (2, 3, 5, or 7).
// For example, "2582" is good because the digits (2 and 8) at even positions are even and the digits (5 and 2) at odd positions are prime. However, "3245" is not good because 3 is at an even index but is not even.
// Given an integer n, return the total number of good digit strings of length n. Since the answer may be large, return it modulo 109 + 7.
// A digit string is a string consisting of digits 0 through 9 that may contain leading zeros.

// Example 1:
// Input: n = 1
// Output: 5
// Explanation: The good numbers of length 1 are "0", "2", "4", "6", "8".
// Example 2:
// Input: n = 4
// Output: 400
// Example 3:
// Input: n = 50
// Output: 564908303
 
// Constraints:
//  n <= 1015



// Time:O(log n)
public class Q1922_count_good_num {
    int mod = 1000000007;
    public int countGoodNumbers(long n) {
        long f = (n%2==0?(n/2):(n/2)+1);
        long s = n/2;
        long m1 = power(5, f)%mod;
        long m2 = power(4, s)%mod;
        long ans = m1% mod;
        ans = (s != 0)?(ans*m2) % mod : ans;
        return (int) (ans%mod);
    }
    public long power(long x, long y){
        long tmp;
        if(y==0) return 1;
        tmp = power(x,y/2);
        if(y%2==0) return (tmp*tmp)%mod;
        else return (x*tmp*tmp)%mod;
    }
}
