package STACK;

import java.util.ArrayList;
import java.util.Stack;

public class STack {

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();

        stack.push(1);
        stack.push(2);

        stack.push(3);
        stack.push(4);

        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(stack.containsAll(list));
        System.out.println(stack.empty());
        System.out.println(stack.isEmpty());
        System.out.println(stack.search(3));

        System.out.println(stack.size());

    }
}
