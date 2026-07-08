package STACK;

import java.util.HashMap;
import java.util.Stack;

public class NextGreteElement1 {
    public static void main(String[] args) {
        int[]nums1 = {4,1,2}, nums2 = {1,3,4,2};
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer,Integer>map = new HashMap<>();
        int n = nums2.length;
        for(int i=n-1;i>=0;i--){
            int num = nums2[i];
            while(!stack.isEmpty() && num>stack.peek()){
                stack.pop();
            }
            if(!stack.isEmpty()){
                map.put(nums2[i],stack.peek());
            }
            else{
                map.put(nums2[i],-1);
            }
            stack.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                nums1[i]=map.get(nums1[i]);
            }
        }
    }
}
