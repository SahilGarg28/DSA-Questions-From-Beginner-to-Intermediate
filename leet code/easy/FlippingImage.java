//https://leetcode.com/problems/flipping-an-image/

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] binaryr:image){
            int start=0;
            int end=binaryr.length-1;
            while(start<=end)
            {
                swap(binaryr,start,end);        
                start++;
                end--;
            }
        }
        for(int[] invert:image){
            for(int i=0;i<invert.length;i++)
            {
                if(invert[i]==0){
                    invert[i]=1;
                }else{
                    invert[i]=0;
                }
                
            }
        }
        return image;
    }
    public void swap(int[] binaryr,int i,int j){
        int temp=binaryr[i];
        binaryr[i]=binaryr[j];
        binaryr[j]=temp;
    }
}