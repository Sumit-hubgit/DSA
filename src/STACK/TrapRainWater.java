package STACK;

import java.util.Arrays;
import java.util.Stack;

public class TrapRainWater {

    public static void main(String[] args) {
        int[]height = {4,2,0,3,2,5};
        int[]leftmax = nextLeft(height);
        int[]rightmax = nextRight(height);
        System.out.println(Arrays.toString(rightmax));

        int sum=0;
        int n =height.length;
        for(int i=0;i<n;i++){
            if(leftmax[i]!=-1 && rightmax[i]!=-1){
                sum=sum + Math.min(leftmax[i],rightmax[i])-height[i];
            }
        }
        System.out.println(sum);
    }
    public static int[] nextLeft(int[]height){
        int n = height.length;
        int[]ans = new int[n];
        Arrays.fill(ans,-1);
        Stack<Integer>stack  = new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && stack.peek()<=height[i]){
                stack.pop();
            }
            if(!stack.isEmpty() && stack.peek()>height[i]){
                ans[i]=stack.peek();
            }
            stack.push(height[i]);
        }
        return ans;
    }

    public static int[] nextRight(int[]height){
        int n = height.length;
        int[]ans = new int[n];
        Arrays.fill(ans,-1);
        Stack<Integer> stack = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=height[i]){
                stack.pop();
            }
            if(!stack.isEmpty() && stack.peek()>height[i]){
                ans[i]=stack.peek();
            }
            stack.push(height[i]);
        }
        return ans;
    }
}
