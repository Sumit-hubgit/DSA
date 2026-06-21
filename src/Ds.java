public class Ds {

    public static void main(String[] args) {

        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};  // Sample array
        int k=2;
        int n = nums.length;
        int i=0,j=0;
        int count=0;
        while(j<n){
            if(nums[i]==1){
                count = Math.max(count,j-i+1);
                j++;
                continue;
            }
            if(nums[i]==0 && k>0){
                count = Math.max(count,j-i+1);
                k--;
                j++;
                continue;
            }
            while(nums[i]!=0){
                i++;
            }
            i++;
            count = Math.max(count,j-i+1);
            j++;
        }
        System.out.println(count);
    }
}
