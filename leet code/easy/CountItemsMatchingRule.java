// https://leetcode.com/problems/count-items-matching-a-rule/

import java.util.List;

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (List<String> item : items) {
            if (ruleKey.equals("type")) {
                if (item.get(0).equals(ruleValue)) {
                    count++;
                }
            } else if (ruleKey.equals("color")) {
                if (item.get(1).equals(ruleValue)) {
                    count++;
                }
            } else if (ruleKey.equals("name")) {
                if (item.get(2).equals(ruleValue)) {
                    count++;
                }
            }
        }
        return count;
    }
}
