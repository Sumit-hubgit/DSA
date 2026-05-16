package adityavermaDP.KnapSackTypeQuestions;

public class SubSetSum {
    public static void main(String[] args) {
        int[]arr={1,2,3};
        int sum=3;
        int n=arr.length;
        boolean[][]dp=new boolean[n+1][sum+1];
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = true;  // Sum of 0 can be made with any number of elements
        }

        for (int j = 1; j < sum + 1; j++) {
            dp[0][j] = false; // No sum other than 0 can be made with 0 elements
        }

        for (int i=1;i<n+1;i++){
            for (int j=1;j<sum+1;j++){
                if(j>=arr[i-1]){
                    dp[i][j]=dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }
                else {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        System.out.println(dp[n][sum]);
       // System.out.println(subsetum(arr,n,sum,dp));
    }
    /**
     ***********  MEMOIZATIO APPROACH ****************
    static boolean subsetum(int[]arr,int n,int sum,boolean[][]dp){
        if(sum==0){
            return true;
        }
        if(sum!=0 && n<=0){
            return false;
        }
        if(arr[n-1]<=sum){
            return dp[n][sum]=subsetum(arr, n-1, sum-arr[n-1],dp) || subsetum(arr,n-1,sum,dp);
        }
        return dp[n][sum] =  subsetum(arr,n-1,sum,dp);
    }
     **/
}
