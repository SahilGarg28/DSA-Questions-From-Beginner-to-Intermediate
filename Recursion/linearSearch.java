public class linearSearch {
    public static void main(String[] args) {
        int []arr={12,5,3,44,0,11};
        int target=12;
        System.out.println(linearS(arr, target, 0));
    }
    static int linearS(int []arr,int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return linearS(arr, target, index+1);

    }
}
