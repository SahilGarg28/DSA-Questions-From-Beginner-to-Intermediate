import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> numList = new ArrayList<>();
        
        for (int digit : num) {
            numList.add(digit);
        }
        
        int carry = 0;
        int i = numList.size() - 1;
        
        while (k != 0 || carry != 0) {
            if (i >= 0) {
                int sum = numList.get(i) + k % 10 + carry;
                numList.set(i, sum % 10);
                carry = sum / 10;
            } else {
                int sum = k % 10 + carry;
                numList.add(0, sum % 10);
                carry = sum / 10;
            }
            k = k / 10;
            i--;
        }
        
        return numList;
    }
}
