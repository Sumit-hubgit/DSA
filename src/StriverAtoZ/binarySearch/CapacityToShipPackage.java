package StriverAtoZ.binarySearch;

public class CapacityToShipPackage {
    public static void main(String[] args) {
        int[]weights = {1,2,3,4,5,6,7,8,9,10};
        int days=5;
        int n = weights.length;
        int sum = 0;
        int start = 0;
        for(int i=0;i<n;i++){
            sum+=weights[i];
        }
        int end = sum;
        int ans = -1;

        while(start<=end){
            int mid = start + (end-start)/2;
            boolean valid = helper(weights,days,mid);
            if(valid){
                ans =mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
    }
    public static boolean helper(int[] weights, int days,int mid){
        int csum=0;
        int count=0;
        int n = weights.length;
        for(int i=0;i<n;i++){
            csum+=weights[i];
            if(csum==mid){
                count++;
                csum=0;
                continue;
            }
            else if(csum>mid){
                csum=weights[i];
                count++;
            }
            if(csum< mid && i==n-1){
                count++;
            }
        }
        return count==days;
    }
}
