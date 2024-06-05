// https://leetcode.com/problems/excel-sheet-column-title/submissions/
class Solution {
    public String convertToTitle(int columnNumber) {
        String ans = "";
        
        while (columnNumber > 0) {
            columnNumber--;
            ans =(char) (columnNumber % 26 + 'A')+ans;
            columnNumber /= 26;
        }    
        return ans.toString();
    }
}

// Method ii

// class Solution {
//     public String convertToTitle(int columnNumber) {
//         StringBuilder ans = new StringBuilder();
        
//         while (columnNumber > 0) {
//             columnNumber--; // Decrement to adjust for zero-indexing
//             char ch = (char) (columnNumber % 26 + 'A');
//             ans.insert(0, ch); // Prepend character
//             columnNumber /= 26; // Move to the next position
//         }
        
//         return ans.toString();
//     }
// }
