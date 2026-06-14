package StriverAtoZ.binarySearch;

public class SearchInRotatedSortedArray2 {

    public static void main(String[] args) {
        int[] nums= {3,1};
        int target = 1;
        int n = nums.length;
        int start = 0;
        int end = n-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                System.out.println("True");
            }
            if(nums[start]==nums[mid] && nums[mid]==nums[end]){
                start++;
                end--;
                continue;
            }
            if(nums[start]<=nums[mid]){
                if(target<nums[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else if(nums[end]>=nums[mid]){
                if(target>=nums[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
    }
}
