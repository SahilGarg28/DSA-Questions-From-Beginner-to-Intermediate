import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        mergesort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void mergesort(int[]arr,int start,int end){
        if(end-start<=1)
        {
            return;
        }
        int mid=start+(end-start)/2;
        mergesort(arr, 0, mid);
        mergesort(arr, mid, end);
        merge(arr,start,mid,end);

    }
    static void merge(int[]arr,int start,int mid,int end){
        int i=start,j=mid,k=0;
        int[] merge=new int[end-start];
        while(i<mid&&j<end){
            if(arr[i]<arr[j])
            {
                merge[k]=arr[i];
                i++;
            }
            else{
                merge[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<mid){
            merge[k]=arr[i];
            k++;i++;
        }
        while(j<end){
            merge[k]=arr[j];
            k++;j++;
        }
        for(int l=0;l<merge.length;l++){
            arr[start+l]=merge[l];
        }
    }
}
