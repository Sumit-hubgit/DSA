package SlidingWindow;

import java.util.HashMap;

public class SubarrayWithAtLeastKDifferentNumbers {
    public static void main(String[] args) {

        int[]nums={1,2,1,2,3};
        HashMap<Integer,Integer>map=new HashMap<>();
        int i=0,j=0,total=0;
        int n=nums.length;
        int k=2;

        while(j<n){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            while(map.size()==k){
                total+=n-j;
                if(map.get(nums[i])>1){
                    map.put(nums[i],map.get(nums[i]-1));
                }
                else {
                    map.remove(nums[i]);
                }
                i++;
            }
            j++;
        }
        System.out.println(total);
    }
}
