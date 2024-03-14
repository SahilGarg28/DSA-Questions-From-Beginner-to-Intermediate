/**
 * ceilingOfNumber
 */
public class ceilingOfNumber {

    public static void main(String[] args) {
        int []arr={2,3,5,9,14,16,18,196};
        int target=15;
        int start=0,end=arr.length-1;
        while(start<end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]<target)
            {
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        System.out.println(arr[start]);
    }
}