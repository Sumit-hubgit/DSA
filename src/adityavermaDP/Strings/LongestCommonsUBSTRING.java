package adityavermaDP.Strings;

import java.util.ArrayList;

public class LongestCommonsUBSTRING {

    static ArrayList<Integer>list=new ArrayList<>();
    public static void main(String[] args) {

        String s1="abfce";
        String s2="abfce";
        int n=s1.length(),m=s2.length();
//        System.out.println(substring(s1,s2,n,m,0));

        int[][]dp=new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            for (int j=0;j<m+1;j++){
                if(i==0||j==0){
                    dp[i][j]=0;
                }
                else {
                    dp[i][j]=-1;
                }
            }
        }
        int maxcount=0;
        for (int i=1;i<n+1;i++){
            for (int j=1;j<m+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else {
                    dp[i][j]=0;
                }
                maxcount=Math.max(dp[i][j],maxcount);
            }
        }
        System.out.println(maxcount);
//        System.out.println(dp[n][m]);

    }

    static int  substring(String s1, String s2,int n , int m,int count){
        if(n==0 || m==0){
            return count;
        }
        if(s1.charAt(n-1)==s2.charAt(m-1)){
            return substring(s1,s2,n-1,m-1,count+1);
        }
        else {
            count=0;
        }
        return Math.max(substring(s1,s2,n-1,m,count),substring(s1,s2,n,m-1,count));
    }
}
