package adityavermaDP.Strings;

import java.util.Arrays;
import java.util.HashMap;

public class ABCD {

    public static String[][] lcs(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();

        // dp[i][j] will store the LCS string of s1[0..i-1] and s2[0..j-1]
        String[][] dp = new String[n1 + 1][n2 + 1];

        // Initialize dp array with empty strings
        for(int i=0;i<n1+1;i++){
            for(int j=0;j<n2+1;j++){
                if(i==0 || j==0){
                    dp[i][j]="";
                }
            }
        }

        for(int i=1;i<n1+1;i++){
            for(int j=1;j<n2+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1) && i!=j){
                    dp[i][j] = dp[i-1][j-1] + s1.charAt(i-1);
                }
                else{
                    dp[i][j] = dp[i-1][j].length() > dp[i][j-1].length()?dp[i-1][j]:dp[i][j-1];
                }
            }
        }

        return dp; // The bottom-right cell has the full LCS
    }

    public static void main(String[] args) {
        String s1 = "letsleetcode";
        String s2 = "letsleetcode";

        String[][] lcs = lcs(s1, s2);

        HashMap<String , Integer>map= new HashMap<>();
        for(int i=0;i<lcs.length;i++){
            for (int j=0;j<lcs[i].length;j++){
                map.put(lcs[i][j] , map.getOrDefault(lcs[i][j], 0)+1);
                System.out.print(lcs[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(map);
        System.out.println();
    }
}

