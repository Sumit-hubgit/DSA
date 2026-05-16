package adityavermaDP.Strings;

public class Try {
    public static void main(String[] args) {
        String s1 = "geek";
        String s2 = "eke";
        int n1=s1.length();
        int n2 = s2.length();
        int[][]dp = new int[n1+1][n2+1];
        for (int i = 0; i < n1+1; i++) {
            for (int j = 0; j < n2+1; j++) {
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
            }
        }

        for (int i = 1; i < n1+1; i++) {
            for (int j = 1; j < n2+1; j++) {
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1 + dp[i-1][j-1];
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
                }
            }
        }
//        System.out.println(dp[n1][n2]);
//        System.out.println(LCS(s1,n1,s2,n2));

        System.out.println(lcs(s1,n1,s2,n2));
    }

    static int LCS(String s1 ,int n1, String s2 ,int n2 ){
        if(n1==0 || n2==0){
            return 0;
        }
        if(s1.charAt(n1-1)==s2.charAt(n2-1)){
            return 1 + LCS(s1,n1-1,s2,n2-1);
        }
        else {
            return  Math.max(LCS(s1, n1-1, s2, n2), LCS(s1, n1, s2, n2-1));
        }
    }
    static String lcs(String s1 , int n1 , String s2 , int n2){
        if(n1==0 || n2==0){
            return "";
        }
        if(s1.charAt(n1-1)==s2.charAt(n2-1)){
            return s1.charAt(n1-1) + lcs(s1,n1-1,s2,n2-1);
        }
        else {
            String a = lcs(s1, n1-1, s2, n2);
            String b= lcs(s1, n1, s2, n2-1);
            return a.length()>b.length()?a:b;
        }
    }
}
