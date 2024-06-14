// package string;

public class removeA {
    public static void main(String[] args) {
        String str="baccad";
        System.out.println(removea(str));
    }
    static String removea(String str){
        if(str.length()==0)
        {
            return "";
        }
        if(str.charAt(0)=='a')
        {
            return ""+removea(str.substring(1));
        }
        else{
        return str.charAt(0)+removea(str.substring(1));}
    }
}
