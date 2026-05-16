package adityavermaDP.Strings;

public class LCS {
    public static void main(String[] args) {

        String s1 = "ADH";
        String s2 = "AEDFHR";
        int n=s1.length(),m=s2.length();
        int[][]dp=new int[n+1][m+1];


        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0 || j==0){
                    dp[i][j]=0;
                }
                else {
                    dp[i][j]=-1;
                }
            }
        }
        for(int i=1;i<n+1;i++){
            for (int j=1;j<m+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        String str="";
        int  i=n,j=m;
        while(i>0 && j>0){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                str=str+s1.charAt(i-1);
                i--;
                j--;
            }
            else{
                if(dp[i][j-1]>dp[i-1][j]){
                    j--;
                }
                else {
                    j--;
                }
            }
        }
        System.out.println(str);
        System.out.println(dp[n][m]);

//        for(int i=0;i<n+1;i++){
//            for(int j=0;j<m+1;j++){
//                if(i==0 || j==0){
//                    dp[i][j]="";
//                }
//                else {
//                    dp[i][j]="-1";
//                }
//            }
//        }
        // Call subsequence with lengths of the strings
        //System.out.println(subsequence(s1, s2, s1.length(), s2.length(),dp).length());
    }

    static int lcs(String str1,String str2,int n1, int n2){
        if(n1==0 || n2==0){
            return 0;
        }
        if(str1.charAt(n1-1)==str2.charAt(n2-1)){
            return 1+lcs(str1,str2,n1-1,n2-1);
        }
        return Math.max(lcs(str1,str2,n1,n2-1) ,  lcs(str1,str2,n1-1,n2));
    }
    static int fun(String str1,String str2,int n1, int n2,int[][]arr){
        if(n1==0 || n2==0){
            return 0;
        }
        if(arr[n1][n2]!=-1){
            return arr[n1][n2];
        }
        if(str1.charAt(n1-1)==str2.charAt(n2-1)){
            return arr[n1][n2]=  1+fun(str1,str2,n1-1,n2-1,arr);
        }
        return Math.max(fun(str1,str2,n1,n2-1,arr) ,  fun(str1,str2,n1-1,n2,arr));
    }

    static String subsequence(String s1, String s2, int n, int m) {
        if (n == 0 || m == 0) {
            return "";
        }
        if (s1.charAt(n - 1) == s2.charAt(m - 1)) {
            // If last characters match, include them in the result
            return subsequence(s1, s2, n - 1, m - 1) + s1.charAt(n - 1);
        } else {
            // Otherwise, compare excluding last character of either string
            String a = subsequence(s1, s2, n - 1, m);
            String b = subsequence(s1, s2, n, m - 1);
            return a.length() > b.length() ? a : b;
        }
    }

    static  String subsequence(String s1, String s2, int n,int m,String[][]dp){
        if(n==0 || m==0){
            return "";
        }
        if(dp[n][m]!="-1"){
            return dp[n][m];
        }
        if(s1.charAt(n-1)==s2.charAt(m-1)){
            return dp[n-1][m-1] = subsequence(s1,s2,n-1,m-1,dp)+ s1.charAt(n-1);
        }
        else {
            String a =  subsequence(s1, s2, n-1, m);
            String b = subsequence( s1,s2,n,m-1);
            return dp[n][m]= a.length()>b.length()?a:b;
        }
    }
}
