package DailyProblemLeetCode;

import java.util.Arrays;

public class MaximumScoreofaSplit {
    public static void main(String[] args) {
        int[]nums={73,32,54};
        int n=nums.length;
        int[]prefix = new int[n];
        if(n==2){
            System.out.println(nums[0]-nums[1]);
        }
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=nums[i]+prefix[i-1];
        }
        int[]minarray = new int[n];
        minarray[n-1]=nums[n-1];
        minarray[n-2]=nums[n-1];
        int m =Math.min(nums[n-1],nums[n-2]);

        for(int i=n-3;i>=0;i--){
            minarray[i]= m;
            m= Math.min(m,nums[i]);
        }
        System.out.println(Arrays.toString(prefix));
        System.out.println(Arrays.toString(minarray));

//        int ans=Integer.MIN_VALUE;
//
//        for(int i=0;i<n;i++){
//            int cal = prefix[i]-minarray[i];
//            ans = Math.max(ans,cal);
//        }
    }
}
