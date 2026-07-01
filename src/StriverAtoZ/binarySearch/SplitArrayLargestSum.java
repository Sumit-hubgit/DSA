package StriverAtoZ.binarySearch;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[]nums={1,2,3,4,5};
        int k=2;
        int start = 0;
        int end = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            end=end+nums[i];
        }
        int ans=Integer.MAX_VALUE;
        while(start<=end){
            int mid = start + (end-start)/2;
            boolean valid = helper(nums,mid,k);
            if(valid){
                ans=mid;
                end = mid-1;
            }
            else{
                start=mid+1;
            }
        }
        System.out.println(ans);
    }
    public static boolean helper(int[]nums,int mid,int k){
        int count=1;
        int csum = 0;
        for(int i=0;i<nums.length;i++){
            csum=csum+nums[i];
            if(csum>mid){
                count++;
                csum=nums[i];
            }
            if(nums[i]>mid){
                return false;
            }
        }
        return count<=k;
    }
}
