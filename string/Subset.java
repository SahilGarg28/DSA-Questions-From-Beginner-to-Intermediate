import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        char []arr={'a','b','c'};
        System.out.println(subset(arr));
    }
    static List<List<Character>> subset(char[] arr){
        List<List<Character>> outer=  new ArrayList<>();
        outer.add(new ArrayList<>());
        for(char num:arr)
        {
            int n=outer.size();
            for(int i=0;i<n;i++){
            List<Character> inner=new ArrayList<>(outer.get(i));
            inner.add(num);
            outer.add(inner);
            }


        }



        return outer;
    }
}
