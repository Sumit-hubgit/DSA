package adityavermaDP.Strings;

import java.util.Arrays;

public class ShoreststCommonSuperSequence {

    public static void main(String[] args) {

        String s1="AGGXTAB";
        String s2="GXTXAXB";
        int n=s1.length(),m=s2.length();
        int[][]dp=new int[n+1][m+1];

        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0 ){
                    dp[i][j]=j;
                }
                if(j==0){
                    dp[i][j]=i;
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1]; // If characters match
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j], dp[i][j - 1]); // If they don't match
                }
            }
        }
        System.out.println(dp[n][m]);
        System.out.println(shortest(s1,s2,s1.length(),s2.length(),dp));
    }


    static int shortest(String s1,String s2,int i,int j,int[][]dp){
        if(i==0){
            return j;
        }
        if(j==0){
            return i;
        }
        if(dp[i][j]!=0){
            return dp[i][j];
        }
        if(s1.charAt(i-1)!=s2.charAt(j-1)){
             return dp[i][j]=  1+Math.min(shortest(s1,s2,i,j-1,dp),shortest(s1,s2,i-1,j,dp));
        }
        else {
            return dp[i][j]=1+shortest(s1,s2,i-1,j-1,dp);
        }
    }
//    static String shortest(String s1,String s2,int i,int j){
//        if(i==0 || j==0){
//            if(i!=0){
//                return s1.substring(0,i);
//            }
//            if(j!=0){
//                return s2.substring(0,j);
//            }
//        }
//        if(s1.charAt(i)!=s2.charAt(j)){
//            String str1= s1.charAt(i)+ shortest(s1, s2, i-1, j);
//            String str2= s2.charAt(j) + shortest(s1, s2, i, j-1);
//
//            return str1.length()>str2.length()?str2:str1;
//        }
//        else {
//            return s1.charAt(i)+shortest(s1, s2, i-1, j-1);
//        }
//    }
}
