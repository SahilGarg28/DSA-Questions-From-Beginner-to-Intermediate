//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

public class infiniteSortedArray {
    public static void main(String[] args) {
        int []arr={2,3,5,6,7,8,10,11,12,15,20,23,30};
        
        int target=0;
        System.out.println(ans(arr, target));
    }
    static int ans(int[] arr,int target){
        //first find the range
        //first start with a box of size 2
        int start=0;
        int end=1;

        //condition for the target to lie in the range
        int ans=binarySearch(arr, target, start, end);
        while(ans==-1)
        {
            int temp=start;
            start=end+1;
            end=2*(end-temp+1)+end;
            ans=binarySearch(arr, target, start, end);
        }
        return ans;
        
    }
    static int binarySearch(int[] arr,int target,int start,int end)
    {
        while(start<=end){
            int mid=start+(end-start)/2;
            try{ if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }}
            catch(Exception exp)
            {
                return -2;
            }
        }
        return -1;
    }
}
