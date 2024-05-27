// package bitwiseOperators;

public class numTwicefindSingleNumArray {
   public static void main(String[] args) {
    int[] arr={2,3,-3,-2,6,5,-5};
    System.out.println(unique(arr));
   }
public static int unique(int[]arr)
{
    int ans=0;
    for(int i:arr)
    {
        ans=ans^i;
    }
    return ans;
}
}
