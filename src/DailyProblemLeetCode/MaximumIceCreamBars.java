package DailyProblemLeetCode;

public class MaximumIceCreamBars {
    public static void main(String[] args) {
        int[]arr = {1,3,2,4,1};
        int coins = 7;
        int n = arr.length;
        int[][]dp = new int[n+1][coins+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<coins+1;j++){
                dp[i][j]=-1;
            }
        }
        int ans= maxbuy(arr,coins,n,dp);
        System.out.println(ans);
    }

    public static int maxbuy(int[]arr,int coin,int n,int[][]dp){
        if(n==0|| coin<=0){
            return 0;
        }
        if(dp[n-1][coin]!=-1){
            return dp[n-1][coin];
        }
        if(arr[n-1]<=coin){
            return dp[n-1][coin]= Math.max(1+maxbuy(arr, coin-arr[n-1], n-1,dp) ,maxbuy(arr,coin,n-1,dp));
        }
        return maxbuy(arr,coin,n-1,dp);
    }
}
