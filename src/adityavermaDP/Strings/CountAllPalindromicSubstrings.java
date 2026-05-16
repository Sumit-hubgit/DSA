package adityavermaDP.Strings;

public class CountAllPalindromicSubstrings {


    public static void main(String[] args) {
        String s1="aba";
        int n=s1.length();
        int[][]dp=new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        int count=0;
        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                if(isPalindrome(s1.substring(i,j+1),i,j,dp)==true){
                    count++;
                }
            }
        }
        System.out.println(count);
//        System.out.println(isPalindrome(s1,0,2,dp));
    }

    static boolean isPalindrome(String s,int i,int j,int[][]dp){
        if(i>=j){
            dp[i][j]=1;
            return true;
        }
        if(dp[i][j]!=-1){
            return dp[i][j] == 1;
        }
        if(s.charAt(i)==s.charAt(j)){
            return true && isPalindrome(s,i+1,j-1,dp);
        }
        else {
            dp[i][j]=0;
            return false;
        }
    }
}
