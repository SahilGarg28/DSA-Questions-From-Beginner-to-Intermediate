public class sqrt {
    public static void main(String[] args) {
        int n=40;
        System.out.printf("%.3f",sqrt(n));
    }
    public static double sqrt(int n){
        int l=0,h=n;
        // int m=l+(h-l)/2;
        double root=0.0;
        while(l<=h){
           int m=l+(h-l)/2;
            if(m*m==n)
            {
                return m;
            }
            else{
                if(m*m>n)
                {
                    h=m-1;
                }
                else if(m*m<n){
                    l=m+1;
                }
            }
            int p=3;
            double incr=0.1;
            for(int i=0;i<p;i++){
                while(root*root<=n){
                    root+=incr;
                }
                root-=incr;
                incr/=10;
            }
        }
        return root;
    }
}
