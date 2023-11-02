// 2798. Number of Employees Who Met the Target

// There are n employees in a company, numbered from 0 to n - 1. Each employee i has worked for hours[i] hours in the company.
// The company requires each employee to work for at least target hours.
// You are given a 0-indexed array of non-negative integers hours of length n and a non-negative integer target.
// Return the integer denoting the number of employees who worked at least target hours.
// Example 1:
// Input: hours = [5,1,4,2,2], target = 6
// Output: 0
// Explanation: The company wants each employee to work for at least 6 hours.
// There are 0 employees who met the target.
// Constraints:
// 1 <= n == hours.length <= 50
// 0 <= hours[i], target <= 105



// Time:O(n)
// Space:O(1)
public class Q2798_target_hours_worked_employees {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int n = hours.length;
        int cnt = 0;

        for(int i=0; i<n; i++){
            if(hours[i] >= target) cnt++;
        }

        return cnt;
    }
}
