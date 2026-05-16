package adityavermaDP.DPonGrid;

public class Uniquepaths2 {
    public static void main(String[] args) {
        int[][]mat= {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };
        int m=3,n=3;

        int[][]dp =new int[m+1][n+1];
        dp[1][1]=1;

        for (int i=1;i<m+1;i++){
            for (int j=1;j<n+1;j++){
                if(mat[i-1][j-1]==1){
                    dp[i][j]=0;
                }
                else {
                    dp[i][j]= dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        System.out.println(dp[m][n]);

       // System.out.println(fun(mat,m-1,n-1));
    }

    static int fun(int[][]mat , int m ,int n){
        if(m==0 && n==0){
            return  1;
        }
        if(m<0 || n<0){
            return 0;
        }
        if(mat[m][n]==1){
            return 0;
        }
        return fun(mat,m-1,n)+ fun(mat,m,n-1);
    }
}
