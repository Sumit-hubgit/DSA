package adityavermaDP.KnapSackTypeQuestions;

public class CountSubsetOfGivenSum {
    public static void main(String[] args) {
        int[]arr={1,1,1};
        int sum=2;
        int n=arr.length;
        int[][]dp=new int[n+1][sum+1];
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = 1;  // Sum of 0 can be made with any number of elements
        }

        for (int j = 1; j < sum + 1; j++) {
            dp[0][j] = 0; // No sum other than 0 can be made with 0 elements
        }

        System.out.println(subsetSumCount(arr,n,sum,dp));

    }

    static int subsetSumCount(int[]arr,int n,int sum,int[][]dp){
        if(sum==0){
            return 1;
        }
        if(n==0){
            return 0;
        }
        if(arr[n-1]<=sum){
            return dp[n][sum]=subsetSumCount(arr,n-1,sum-arr[n-1],dp)+subsetSumCount(arr,n-1,sum,dp);
        }
        else {
            return dp[n][sum]=subsetSumCount(arr,n-1,sum,dp);
        }
    }
}
