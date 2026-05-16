package adityavermaDP.Strings;

public class EditDistance {
    public static void main(String[] args) {
        String s1="intention";
        String s2  ="execution";
        int n=s1.length(),m=s2.length();
        int[][]dp=new int[n+1][m+1];
        for (int i=0;i<n+1;i++){
            for (int j=0;j<m+1;j++){
                if(i==0){
                    dp[i][j]=j;
                }
                if(j==0){
                    dp[i][j]=i;
                }
            }
        }
        for (int i=1;i<n+1;i++){
            for (int j=1;j<m+1;j++){
                if(s1.charAt(i-1)!=s2.charAt(j-1)){
                    int insert  =  1+ dp[i][j-1];
                    int delete =  1+ dp[i-1][j];
                    int replace = 1+dp[i-1][j-1];
                    int min= insert>delete?delete:insert;
                    dp[i][j]= Math.min(min,replace);
                }
                else {
                    dp[i][j]=dp[i-1][j-1];
                }
            }
        }
        System.out.println(dp[n][m]);
        System.out.println(distance(s1,s2,0,0,n,m));
    }

    static int distance(String s1,String s2,int i,int j,int n,int m){
        if(j==m){
            return n-i;
        }
        if(i==n){
            return m-j;
        }

       if(s1.charAt(i)!=s2.charAt(j)){
           int insert  =  1+ distance(s1, s2, i, j+1, n, m) ;
           int delete =  1+ distance(s1,s2,i+1,j,n,m);
           int replace = 1+ distance(s1, s2, i+1, j+1, n, m);
           int min= insert>delete?delete:insert;
           return Math.min(min,replace);

       }
       else {
           return distance(s1, s2, i+1, j+1, n, m);
       }

    }
}
