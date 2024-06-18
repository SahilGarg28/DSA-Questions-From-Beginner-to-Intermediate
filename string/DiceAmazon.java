import java.util.ArrayList;
import java.util.List;

public class DiceAmazon {
    public static void main(String[] args) {
        System.out.println(dice("",4));
    }
    static List<String> dice(String p,int up){
        List<String> list=new ArrayList<>();
        if(up==0){
            list.add(p);
            return list;
        }
        for(int i=1;i<=6&&i<=up;i++){
            list.addAll(dice(p+i,up-i));
        }
        return list;
    }
}
