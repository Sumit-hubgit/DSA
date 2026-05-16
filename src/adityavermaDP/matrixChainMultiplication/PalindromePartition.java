package adityavermaDP.matrixChainMultiplication;

public class PalindromePartition {
    public static void main(String[] args) {
        String str = "nitin";
        int n = str.length();

        System.out.println(solve(str,0,n-1));
    }
    static int solve(String str , int i , int j){
        if(i>=j){
            return 0;
        }
        if(isPalindrome(str.substring(i,j))){
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for (int k=i;k<j;k++){
            int cost = 1 + solve(str,i,k) + solve(str,k+1,j);
            min = Math.min(min,cost);
        }
        return min;
    }

    static boolean isPalindrome(String str){
        int i=0,j=str.length()-1;
        while (i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            else {
                i++;
                j--;
            }
        }
        return true;
    }
}
