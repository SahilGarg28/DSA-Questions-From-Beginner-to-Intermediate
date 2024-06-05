import java.util.ArrayList;

public class FindAllIndex {
     public static void main(String[] args) {
        int arr[]={1,2,3,3,4,5};
        int target=3;
        // ArrayList<Integer> ans=new ArrayList<>();
        System.out.println(search(arr,target,0).toString());
    }
    static ArrayList<Integer> search(int[]arr,int target,int index){
        ArrayList<Integer> list=new ArrayList<Integer>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target)
        {
            list.add(index);
        }
        ArrayList<Integer> ansFromLowCalls=search(arr, target, index+1);
        list.addAll(ansFromLowCalls);
        return list;

    }
}
