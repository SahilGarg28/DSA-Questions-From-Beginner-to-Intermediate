// https://leetcode.com/problems/roman-to-integer/submissions/
class Solution {
    public int romanToInt(String s) {
        int num=0;
        for(int i=s.length()-1;i>=0;i--){
            switch (s.charAt(i)){
                case 'I':
                    if(i+1<=s.length()-1&&s.charAt(i+1)=='V'){
                        num=num-1;
                        break;
                    }
                    if(i+1<=s.length()-1&&s.charAt(i+1)=='X'){
                        num=num-1;
                        break;
                    }
                    num=num+1;
                    break;
                case 'V':
                    num=num+5;
                    break;
                case 'X':
                    if(i+1<=s.length()-1&&s.charAt(i+1)=='L'){
                        num=num-10;
                        break;
                    }
                    if(i+1<=s.length()-1&&s.charAt(i+1)=='C'){
                        num=num-10;
                        break;
                    }
                    num=num+10;
                    break;
                case 'L':
                    num=num+50;
                    break;
                case 'C':
                    if(i+1<=s.length()-1&&s.charAt(i+1)=='D'){
                        num=num-100;
                        break;
                    }
                    if(i+1<=s.length()-1&&s.charAt(i+1)=='M'){
                        num=num-100;
                        break;
                    }
                    num=num+100;
                    break;
                case 'D':
                    num=num+500;
                    break;
                case 'M':
                    num=num+1000;
                    break;
            }
        }
        return num;
    }
}