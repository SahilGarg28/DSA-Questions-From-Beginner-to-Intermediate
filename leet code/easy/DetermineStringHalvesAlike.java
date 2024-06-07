// https://leetcode.com/problems/determine-if-string-halves-are-alike/
// method 1
class Solution {
    public boolean halvesAreAlike(String s) {
        char[] sArray = s.toCharArray();
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        int mid = sArray.length / 2;
        int count1 = 0, count2 = 0;
        
        for (int i = 0; i < mid; i++) {
            if (vowels.contains(sArray[i])) {
                count1++;
            }
            if (vowels.contains(sArray[mid + i])) {
                count2++;
            }
        }
        
        return count1 == count2;
    }
}

// method 2
class Solution {
    public boolean halvesAreAlike(String s) {
        

        int start=0;
        int end=s.length()-1;

        int mid=(start+end)/2;
        
        
        int count=0;
        while(start<=mid){
            char ch=s.charAt(start);
            if(isVowel(ch)){
                count++;
            }
            start++;
        }

        int count2=0;

        while(end>mid){
            char ch=s.charAt(end);
            if(isVowel(ch)){
                count2++;
            }
            end--;
        }
        
        
        return count==count2;

    }

    public boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}