import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
        mergesort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergesort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            mergesort(arr, start, mid);
            mergesort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    static void merge(int[] arr, int start, int mid, int end) {
        int[] merge = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                merge[k] = arr[i];
                i++;
            } else {
                merge[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            merge[k] = arr[i];
            i++;
            k++;
        }
        while (j <= end) {
            merge[k] = arr[j];
            j++;
            k++;
        }
        for (i = start, k = 0; i <= end; i++, k++) {
            arr[i] = merge[k];
        }
    }
}
