package Infosys;

import java.util.Arrays;

public class FindMax {
    public static void main(String[] args) {
        int n=6;
        int[]nums=new int[n+1];
        nums[0]=0;
        nums[1]=1;

        for (int i=1;i<=n/2;i++){
            if(i*2<=n){
                nums[i*2]=nums[i];
            }
            if(i*2 +1<=n){
                nums[i*2+1]= nums[i]+nums[i+1];
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
