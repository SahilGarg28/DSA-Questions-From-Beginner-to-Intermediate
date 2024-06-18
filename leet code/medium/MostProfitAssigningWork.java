public class MostProfitAssigningWork {
    static class Solution {
        public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
            int ans=0;
            for(int w=0;w<worker.length;w++){
                int maxP=0;
                for(int d=0;d<difficulty.length;d++){
                    if(difficulty[d]<=worker[w]&&profit[d]>maxP)
                    {
                        maxP=profit[d];
                    }
                }
            ans+=maxP;
            }
            return ans;
        }
    }
    public static void main(String[] args) {
        Solution obj=new Solution();
        int[]difficulty={2,4,6,8,10};
        int[]profit ={10,20,30,40,50};
        int []worker={4,5,6,7};
        int result=obj.maxProfitAssignment(difficulty, profit, worker);
        System.out.println(result);;

    }
}
