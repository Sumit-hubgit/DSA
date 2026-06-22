package STACK;

import java.util.Arrays;
import java.util.Stack;

public class SumofSubarrayMinimums {
    public static void main(String[] args) {
        int[]arr = {3,1,2,4};
        int n = arr.length;
        int[]left= nextLeft(arr);
        System.out.println(Arrays.toString(left));
        int[]right = nextRight(arr);
        System.out.println(Arrays.toString(right));
    }
    public static int[] nextLeft(int[]arr){
        int n = arr.length;
        Stack<Integer>stack = new Stack<>();
        int[]ans = new int[n];
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[i]<arr[stack.peek()]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                ans[i]=i-stack.peek();
            }
            else {
                ans[i]=i+1;
            }
            stack.push(i);
        }
        return ans;
    }
    public static int[] nextRight(int[]arr){
        int n = arr.length;
        Stack<Integer>stack = new Stack<>();
        int[]ans = new int[n];
        for (int i = n-1; i >=0; i--) {
            while(!stack.isEmpty()&& arr[i]<=arr[stack.peek()]){
                stack.pop();
            }
            if (!stack.isEmpty()){
                ans[i]=stack.peek()-i;
            }
            else {
                ans[i]=n-i;
            }
            stack.push(i);
        }
        return ans;
    }
}
