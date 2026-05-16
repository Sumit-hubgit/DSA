package StriverAtoZ;

public class MaxSubarraySum {

    public static void main(String[] args) {
        int[]arr={1,4,3,3,5};
        int N=arr.length;
        int k=16;
        int i=0,j=0,sum=0,ans=0;
        while(j<N){
            sum=sum+arr[j];
            if(sum==k){
                ans=Math.max(ans,j-i+1);
                sum=sum-arr[i];
                i++;
            }
            else if(sum>k){
                while(sum>k){
                    sum=sum-arr[i];
                    i++;
                }
            }
            j++;
        }

    }
}
