import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int []arr){
        for(int i=0;i<arr.length-1;i++)
        {
            int j=i;
            while(j>=0&&arr[j]>arr[j+1])
            {
                swap(arr, j, j+1);
                j--;

            }
        }
    }
    
    static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
