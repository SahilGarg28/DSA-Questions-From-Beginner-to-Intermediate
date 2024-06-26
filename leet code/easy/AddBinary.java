//https://leetcode.com/problems/add-binary/
class Solution {
    public String addBinary(String a, String b) {
        String sb ="";
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while(i >=0 || j >=0){
            int sum = carry;
            if(i>=0){
                sum += a.charAt(i--) - '0';
            }
            if(j>=0){
                sum += b.charAt(j--) - '0';
            }
            sb=sum%2+sb;
            carry = sum/2;
        }
        
        // if(carry!= 0)sb.append(carry);
        return sb;
    }
}