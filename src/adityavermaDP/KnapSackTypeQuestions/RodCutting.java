package adityavermaDP.KnapSackTypeQuestions;

public class RodCutting {
    public static void main(String[] args) {
        int[]l={1,2,3,4,5,6,7,8};
        int[]val={1, 5, 8, 9, 10, 17, 17, 20};
        int L=l.length;
        int[][]dp = new int[L+1][L+1];

        for(int i=0;i<L+1;i++){
            for (int j=0;j<L+1;j++){
                if(i==0|| j==0){
                    dp[i][j]=0;
                }
            }
        }

        for(int i=1;i<L+1;i++){
            for(int j=0;j<L+1;j++){
                if(l[i-1]<=j){
                    dp[i][j]= Math.max(val[i-1]+dp[i][j-l[i-1]],  dp[i-1][j]);
                }
                else {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        System.out.println(dp[L][L]);
//        System.out.println(rod(val,L,l,L));


    }

  /*  static int rod(int []val,int n,int[]l,int L){
        if(n==0 || L==0){
            return 0;
        }
        if(l[n-1]<=L){
            return Math.max(val[n-1]+rod(val, n, l, L-l[n-1]), rod(val, n-1, l, L));
        }
        else {
            return rod(val, n-1, l, L);
        }
    }
   */
}
