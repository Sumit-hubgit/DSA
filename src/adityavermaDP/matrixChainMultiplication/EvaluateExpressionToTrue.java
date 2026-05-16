package adityavermaDP.matrixChainMultiplication;

public class EvaluateExpressionToTrue {
    public static void main(String[] args) {

        String s="T|T&F^T";
        int n = s.length();
        int[][]dp =new int[n+1][n+1];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println( solve(s,0,s.length()-1,true));
    }

    static int solve(String s , int i, int j , boolean isTrue){
        if(i==j){
            if (isTrue){
                return (s.charAt(j)=='T')?1:0;
            }
            else {
                return (s.charAt(j)=='F')?1:0;
            }
        }

        int ans=0;
        for (int k = i+1; k <j ; k+=2) {
            char op = s.charAt(k);

            int lt = solve(s,i,k-1,true);
            int lf = solve(s,i,k-1,false);
            int rt = solve(s,k+1,j,true);
            int rf = solve(s,k+1,j,false);

            if(op=='&'){
                if(isTrue){
                    ans+=lt*rt;
                }
                else {
                    ans+= lt*rf + lf*rf +lf*rt;
                }
            }
            if (op=='|'){
                if(isTrue){
                    ans+=lt*rt + lt*rf + lf*rt;
                }
                else {
                    ans+=lf*rf;
                }
            }
            if (op=='^'){
                if(isTrue){
                    ans+=lt*rf + lf*rt;
                }
                else {
                    ans+=lf*rf + lt*rt;
                }
            }
        }
        return  ans;
    }
}
