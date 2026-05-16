package DailyProblemLeetCode;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[]arr = {9,8,7,6,5,4,3,2,1,0};
        int places=1;
        int i=arr.length-1;
        int res=0;
        int t=arr.length;
        while(i>=0){
            res=arr[i]*places + res;
            places*=10;
            i--;
        }
        res=res+1;
        String str = Integer.toString(res);
        int n = str.length();
        int[]ans = new int[n];
        for(i=0;i<n;i++){
            ans[i] = str.charAt(i)-'0';
        }
        System.out.println(Arrays.toString(ans));
    }
}
