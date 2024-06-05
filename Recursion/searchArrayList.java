import java.util.ArrayList;

public class searchArrayList {
    public static void main(String[] args) {
        int arr[]={1,2,3,3,4,5};
        int target=6;
        ArrayList<Integer> ans=new ArrayList<>();
        System.out.println(search(arr,target,ans,0).toString());
    }
    static ArrayList<Integer> search(int[]arr,int target,ArrayList<Integer> ans,int index){
        if(index==arr.length){
            return ans;
        }
        if(arr[index]==target)
        {
            ans.add(index);
        }
        
        return search(arr, target, ans, index+1);

    }
}
