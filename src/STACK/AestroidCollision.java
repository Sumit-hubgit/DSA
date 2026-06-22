package STACK;

import java.util.Stack;

public class AestroidCollision {
    public static void main(String[] args) {
        int[]asteroids = {10,2,-5};
        int n = asteroids.length;
        Stack<Integer> stack = new Stack<>();
        stack.push(asteroids[n-1]);
        for(int i=n-2;i>=0;i--){
            while((!stack.isEmpty() && stack.peek()<0 && asteroids[i]>0)){
                if(Math.abs(stack.peek())<asteroids[i]){
                    stack.pop();
                }
                else{
                    break;
                }
            }
            if((asteroids[i]>0 && stack.peek()>0)|| (asteroids[i]<0 && stack.peek()<0)|| (asteroids[i]<0 && stack.peek()>0)){
                stack.push(asteroids[i]);
                continue;
            }
        }
        System.out.println(stack);
    }
}
