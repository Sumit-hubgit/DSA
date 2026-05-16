package adityavermaDP.matrixChainMultiplication;

public class MCMRecursive {
    public static void main(String[] args) {
        int[]arr={40, 20, 30, 10, 30};
        int n = arr.length;
        int[][]dp = new int[n+1][n+1];
        for (int i=0;i<n+1;i++){
            for (int j=0;j<n+1;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(cost(arr,1,n-1,dp));
    }

    static int cost(int[]arr , int i , int j, int[][]dp){
        if(i==j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int min = Integer.MAX_VALUE;
        for (int k=i;k<j;k++){
            int left  = cost(arr ,i,k,dp);
            int right = cost(arr,k+1,j,dp);
            int c = left + right  + arr[i-1]*arr[k]*arr[j];
            min = Math.min(min,c);

        }
        dp[i][j] = min;
        return min;
    }
}
