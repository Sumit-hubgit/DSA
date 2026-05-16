package adityavermaDP.KnapSackTypeQuestions;

public class Knapsack01TopDown {
    public static void main(String[] args) {

        int []wt={10,20,30};
        int[]val={60,100,120};
        int n=wt.length;
        int W=50;
        int[][]dp=new int[n+1][W+1];

        for (int i=0;i<n+1;i++){
            for (int j=0;j<W+1;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
            }
        }
        for (int i=1;i<n+1;i++){
            for (int j=1;j<W+1;j++){
                if(wt[i-1]<=j){
                    dp[i][j]=Math.max(val[i-1]+dp[n-1][W-wt[i-1]],dp[n-1][W]);
                }
                else {
                    dp[i][j]=dp[n-1][W];
                }
            }
        }
        System.out.println(dp[n][W]);
    }

}
