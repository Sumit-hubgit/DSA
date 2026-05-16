public class Ds {

    public static void main(String[] args) {

        int[] nums = {1,1,1,1,2,3,5,1};  // Sample array
        int i=2,j=0;
        boolean flag = false;
        int n=nums.length;
        Integer max = Integer.MIN_VALUE;

        while(i<n) {
            if (nums[i] == nums[i - 1] + nums[i - 2]) {
                if (flag == false) {
                    j = i - 2;
                    flag=true;
                }
                max = Math.max(max, i-j + 1);
            }
            else {
                flag=false;
            }
            i++;
        }
        System.out.println(max);;
    }
}
