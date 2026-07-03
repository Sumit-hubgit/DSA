package STACK;

import java.util.Arrays;
import java.util.Stack;

public class AestroidCollision {
    public static void main(String[] args) {
        int[]arr= {8,-8};
        int n = arr.length;
        Stack<Integer>stack = new Stack<>();
        for(int i=0;i<n;i++){
            boolean destroyed = false;
            while(!stack.isEmpty() && arr[i]<0 && stack.peek()>0){

                if(stack.peek()<-arr[i]){
                    stack.pop();
                }
                else if(stack.peek()==-arr[i]){
                    stack.pop();
                    destroyed=true;
                    break;
                }
                else{
                    destroyed=true;
                    break;
                }
            }

            if(destroyed==false){
                stack.push(arr[i]);
            }
        }
        System.out.println(stack);
    }
}

