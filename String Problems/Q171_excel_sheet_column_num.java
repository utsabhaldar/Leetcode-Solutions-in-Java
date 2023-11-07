// 171. Excel Sheet Column Number

// Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.
// For example:
// A -> 1, B -> 2, C -> 3... Z -> 26, AA -> 27, AB -> 28 ...
// Example 1:
// Input: columnTitle = "A"
// Output: 1
// Constraints:
// 1 <= columnTitle.length <= 7
// columnTitle consists only of uppercase English letters.
// columnTitle is in the range ["A", "FXSHRXW"].


// Time:O(n)
// Space:O(1)
public class Q171_excel_sheet_column_num {
    public int titleToNumber(String col) {
        int ans = 0, pos = 0;

        for(char c : col.toCharArray()){
            pos = c+1 - 'A';
            ans = ans*26 + pos;
        }

        return ans;
    }
}
