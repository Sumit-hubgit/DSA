package DynamicProgramming;

public class Fibonacci {
    public static void main(String[] args) {
        int n=3;
        int[]dp=new int[4];
        System.out.println(fibo(n,dp));

    }

    static int fibo(int n,int[]dp){
        if(n<=1){
            return n;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        return dp[n]=fibo(n-1,dp)+fibo(n-2,dp);
    }
}
