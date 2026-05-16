package adityavermaDP.KnapSackTypeQuestions;

public class CoinChange {
    public static void main(String[] args) {
        int[]coin= {1, 2, 3};
        int target=5,n=coin.length;
        int[][]dp=new int[n+1][target+1];
        for(int i=0;i<n+1;i++) {
            for (int j = 0; j < target + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = -1;
                }
            }
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<target+1;j++){
                if(coin[i-1]<=j){
                    dp[i][j]=Math.min(1+dp[i][j-coin[i-1]],dp[i][j]);
                }
                else {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        System.out.println(dp[n][target]);
      //  System.out.println(Ways(coin,coin.length,target,dp));
    }
//    static int Ways(int[]coin,int n,int target,int[][]dp){
//        if(n==0){
//            return 0;
//        }
//        if(target==0){
//            return 1;
//        }
//        if(dp[n][target]!=-1){
//            return dp[n][target];
//        }
//        if(coin[n-1]<=target){
//            return dp[n][target]=Ways(coin,n,target-coin[n-1],dp)+Ways(coin,n-1,target,dp);
//        }
//        else {
//            return dp[n][target]=Ways(coin,n-1,target,dp);
//        }
//    }
}
