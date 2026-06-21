package STACK;

import java.util.ArrayList;
import java.util.List;

public class StackUsingArrays {
    static List<Integer>list = new ArrayList<>();

    public void push(int n){
        list.add(n);
    }
    public void pop(){
        list.removeLast();
    }
    public int top(){
        return list.get(list.size()-1);
    }
    public int size(){
        return list.size();
    }

    public static void main(String[] args) {
        StackUsingArrays stack = new StackUsingArrays();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.top());
    }
}
