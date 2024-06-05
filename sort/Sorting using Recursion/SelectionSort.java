// package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {9, 1, 0, 456};
        System.out.println(Arrays.toString(selectionSort(arr, arr.length - 1, 0, 0)));
    }

    static int[] selectionSort(int[] arr, int l, int index, int max) {
        // Base case: If we have sorted the entire array
        if (l == 0) {
            return arr;
        }

        // Find the maximum element in the current pass
        if (arr[index] > arr[max]) {
            max = index;
        }

        // If we have completed one pass, do the swap and start the next pass
        if (index == l) {
            // Swap the found maximum element with the last element of the current pass
            int temp = arr[l];
            arr[l] = arr[max];
            arr[max] = temp;

            // Start the next pass
            return selectionSort(arr, l - 1, 0, 0);
        }

        // Continue the current pass
        return selectionSort(arr, l, index + 1, max);
    }
}
