package STACK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class NextSmallerElement {
    public static void main(String[] args) {
        int[]arr = {8 ,8 ,2 ,2 ,4 ,9, 1 ,1 ,5 ,10};
        int n = arr.length;
        ArrayList<Integer>list = new ArrayList<>();
        Stack<Integer>stack = new Stack<>();
        int[]ans = new int[n];

        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()>arr[i]){
                stack.pop();
            }
            if(!stack.isEmpty() && stack.peek()<arr[i]){

                list.add(0,stack.peek());
            }
            else{
                list.add(0,-1);
            }

            stack.push(arr[i]);
        }
        System.out.println(list);
    }
}
