import java.util.ArrayList;

public class factors {
    public static void main(String[] args) {
        int n=20;
        ArrayList list=new ArrayList<>();
        for(int i=1;i*i<n;i++){
            if(n%i==0){
                if(n/i==i){
                    System.out.println(i+" ");
                }
                else{
                System.out.print(i+" ");
                list.add(n/i);}
            }
        }
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }
}
