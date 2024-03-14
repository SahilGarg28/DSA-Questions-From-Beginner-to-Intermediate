public class floorOfNumber {
    public static void main(String[] args) {
        int []arr={2,3,5,9,14,16,18,196};
        int target=1;
        int start=0,end=arr.length-1;
        while(start <= end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid] <= target)
            {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        System.out.println(arr[end]); // Print arr[end] instead of arr[start]
    }
}
