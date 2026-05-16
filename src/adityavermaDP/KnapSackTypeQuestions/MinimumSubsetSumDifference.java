package adityavermaDP.KnapSackTypeQuestions;

import java.util.Arrays;

public class MinimumSubsetSumDifference {

    public static void main(String[] args) {

        int[]arr = {1,2,3,4};
        int tsum=0;
        for( int i:arr){
            tsum+=i;
        }
        int n=arr.length;
        int[][]dp=new int[n+1][tsum+1];
        for (int[] row : dp)
            Arrays.fill(row, -1);

        System.out.println(minSubsetDifference(arr,tsum,n,0,dp));

    }

    static int minSubsetDifference(int[]arr,int tsum,int n,int csum,int[][]dp){
        if(n==0){
            int s2 = tsum-csum;
            return Math.abs(csum-s2);
        }
        if(dp[n][csum]!=-1){
            return dp[n][tsum];
        }
        return dp[n][csum]= Math.min(minSubsetDifference(arr,tsum,n-1,csum+arr[n-1],dp),
                minSubsetDifference(arr, tsum, n-1, csum, dp));
    }
}
