//https://leetcode.com/problems/goal-parser-interpretation/description/
class Solution {
    public String interpret(String command) {
        return command.replace("()","o").replace("(al)","al");
    }
}