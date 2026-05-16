package Recursion;

public class TargetSumWays {

    public static void main(String[] args) {
        int[]nums={1,1,1,1,1};
        int target=3;
        int ans=ways(nums,target,0,nums.length,0);
        System.out.println(ans);
    }


public static int ways(int[]nums,int target,int i,int n,int csum) {

    if (i == n && csum == target) {
        return 1;
    } else if (i == n) {
        return 0;
    }
    return ways(nums, target, i + 1, n, csum + nums[i]) + ways(nums, target, i + 1, n, csum - nums[i]);
    }
}
