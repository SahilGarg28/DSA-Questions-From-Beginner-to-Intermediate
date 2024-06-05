// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1="";
        String str2="";
      for(String wordf:word1){
        str1=str1+wordf;
      }
        for(String words:word2){
            str2=str2+words;
        }
      if(str1.equals(str2))
      return true;
      return false;  
    }
}