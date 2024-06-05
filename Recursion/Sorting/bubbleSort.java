// package Sorting;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int []arr={12,3,4,1,8};
        System.out.println(Arrays.toString(bubblesort(arr,arr.length-1,0)));
    }
    static int[] bubblesort(int []arr,int length,int index){
        if(length==0){
            return arr;
        }
        if(index<length){
        if(arr[index]>arr[index+1]){
            int temp=arr[index];
            arr[index]=arr[index+1];
            arr[index+1]=temp;
        }
        return bubblesort(arr, length, index+1);
    }else{
    return bubblesort(arr, length-1, 0);}
    }
    
}
