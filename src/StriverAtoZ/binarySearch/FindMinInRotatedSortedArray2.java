package StriverAtoZ.binarySearch;

public class FindMinInRotatedSortedArray2 {
    public static void main(String[] args) {
        int[]arr= {1,3,5};
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int ans = Integer.MAX_VALUE;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[start]==arr[mid] && arr[mid]==arr[end]){
                ans = Math.min(ans,arr[start]);
                start++;
                end--;
                continue;
            }
            if(arr[start]<=arr[mid]){
                ans  = Math.min(ans,arr[start]);
                start = mid+1;
            }
            else{
                ans = mid;
                end  = mid-1;
            }
        }
        System.out.println(ans);
    }
}
