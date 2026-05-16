package adityavermaDP.Strings;

public class SequencePatternMatching {

    public static void main(String[] args) {
        String a= "AXY";
        String b = "ADXCPY";
        int n1 = a.length();
        int n2= b.length();
        String[][]dp = new String[n1+1][n2+1];

        for (int i=0;i<n1+1;i++){
            for (int j=0;j<n2+1;j++){
                if(i==0 || j==0){
                    dp[i][j]="";
                }
            }
        }

        for (int i=1;i<n1+1;i++){
            for (int j=1;j<n2+1;j++){
                if(a.charAt(i-1)==b.charAt(j-1)){
                    dp[i][j]= dp[i-1][j-1] + a.charAt(i-1);
                }
                else {
                    dp[i][j]= dp[i-1][j].length()> dp[i][j-1].length() ? dp[i-1][j] :  dp[i][j-1];
                }
            }
        }

        if(dp[n1][n2].equals(a)){
            System.out.println("String Matched");
        }
        else {
            System.out.println("String not matched");
        }
        System.out.println(dp[n1][n2]);

    }
}
