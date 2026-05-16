package adityavermaDP.LongestIncreasingSubsequence;

import java.util.Arrays;

public class LongestStringChain {
    public static void main(String[] args) {
        String[]arr = {"c", "ab", "a", "bc"};
        int n=arr.length;
        Arrays.sort(arr, (a,b) -> a.length() - b.length());
        // System.out.println(Arrays.toString(arr));
        int[]dp=new int[n];
        for (int i=0;i<n;i++ ) {
            dp[i]=1;
        }
        int max=0;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(fun(arr[j],arr[i])){
                    dp[i]=Math.max(dp[j]+1,dp[i]);
                }
            }
        }

        for(int i=0;i<n;i++){
            max=Math.max(dp[i],max);
        }
        System.out.println(max);
    }

    static boolean fun(String shorter , String longer){
        if(longer.length()!=shorter.length()+1){
            return false;
        }
        int i=0,j=0;
        while(i<shorter.length() && j<longer.length()){
            if(shorter.charAt(i)==longer.charAt(j)){
                i++;
            }
            j++;
        }
        return i==shorter.length();
    }
}
