package SlidingWindow;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[]nums={0,2};
        int n = nums.length;
        int k=0;
//        if(n==1){
//            return nums[0];
//        }
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                k++;
            }
        }
        if(k%2!=0){
            k=k-1;
        }
        int prod=1;
        int i=0;
        int max=Integer.MIN_VALUE;
        for(int j=0;j<n;j++){
            if(nums[i]==0){

            }
            prod=prod*nums[j];
            if(nums[j]<0){
                k--;
            }
            if(nums[j]<0 &&k<0){
                while(nums[i]>0){
                    prod=prod/nums[i];
                    if(nums[i]<0){
                        prod=prod*-1;
                    }
                    i++;
                }
                i++;
            }
            max=Math.max(prod,max);
        }
        System.out.println(max);
    }
}
