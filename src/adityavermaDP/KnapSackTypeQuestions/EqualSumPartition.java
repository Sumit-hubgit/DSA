package adityavermaDP.KnapSackTypeQuestions;

public class EqualSumPartition {

    /**
     Ek array di huwi hai usko 2 parts mein divide karna hai such that dono array ka sum
     equal ho dono array ka.
     */
    /*
    Approach pehle poore array ka sum nikal lenge agar even sum hai tabhi array divide ho skti hai
    nhi toh return kar denge false. Fir us sum ka half  karenge or fir find karenge array mein ki half wala
    sum present hai ya nhi.
     */
    public static void main(String[] args) {
        int[]arr={1,5,11};
        int n=arr.length;
        int sum=0;

        for (int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        boolean[][]dp=new boolean[n+1][sum+1];
        if(sum%2!=0){
            System.out.println(false);
        }
        else {

            for (int i=0;i<n+1;i++){
                dp[i][0]=true;
            }
            for (int j=1;j<sum+1;j++){
                dp[0][j]=false;
            }

            for (int i=1;i<n+1;i++){
                for (int j=1;j<sum+1;j++){
                    if(arr[i-1]<=j){
                        dp[i][j]=dp[i-1][j-arr[i-1]] || dp[i-1][j];
                    }
                    else {
                        dp[i][j]=dp[i-1][j];
                    }
                }
            }
        }
        System.out.println(dp[n][sum]);
    }
}
