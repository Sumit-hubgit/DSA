package Infosys;
import java.util.Arrays;
import java.util.*;

public class Twosun {
    public static void main(String[] args) {
        int[]nums ={1, 6, 2, 10, 3};
        int target = 7;

        int n = nums.length;
        int[]ans=new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],i);
            int num = target-nums[i];
            if(map.containsKey(nums)){
                ans[0]=map.get(nums);
                ans[1]=i;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
