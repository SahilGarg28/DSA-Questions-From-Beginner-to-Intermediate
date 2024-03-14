//744. Find Smallest Letter Greater Than Target leet code
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start=0,end=letters.length-1;
        if(letters[end]<=target)
            return letters[start];
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target<letters[mid])
                end=mid-1;
            else if(target>=letters[mid])
                start=mid+1;
            else
                return letters[start];
        }
        return letters[start];
    }
}