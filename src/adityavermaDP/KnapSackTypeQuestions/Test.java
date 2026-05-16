package adityavermaDP.KnapSackTypeQuestions;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[]wt={1,3,4,5};
        int[]val = {1,4,5,7};
        int W=7;
        int n=wt.length;

        int[][]dp=new int[n+1][W+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=W;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
            }
        }

        for (int i=1;i<=n;i++){
            for (int j=1;j<=W;j++){
                if(wt[i-1]<=j){
                    dp[i][j]=Math.max(val[i-1]+dp[i-1][j-wt[i-1]],dp[i-1][j]);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        System.out.println(dp[n][W]);

      //  int ans = knapsack(wt,val,W,wt.length,dp);
       // System.out.println(ans);

    }

    static int knapsack(int[]wt,int[]val,int W, int n,int[][]dp) {
        if (n == 0 || W == 0) {
            return 0;
        }
        if (dp[n][W] != -1) {
            return dp[n - 1][W];
        }
        if (wt[n - 1] <= W) {
            return Math.max(val[n - 1] + knapsack(wt, val, W - wt[n - 1], n, dp), knapsack(wt, val, W, n - 1, dp));
        } else {
            return knapsack(wt, val, W, n - 1, dp);
        }
    }

}
