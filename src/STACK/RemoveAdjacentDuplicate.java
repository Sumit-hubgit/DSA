package STACK;

import java.util.Stack;

public class RemoveAdjacentDuplicate {
    public static void main(String[] args) {
        String s = "azxxzy";
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            boolean flag=false;
            while(!stack.isEmpty()&& ch== stack.peek()){
                stack.pop();
                flag=true;
            }
            if(flag==true){
                continue;
            }
            if(!flag || stack.isEmpty()){
                stack.push(ch);
            }

        }
        System.out.println(stack);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<=stack.size();i++) {
            sb = sb.append(stack.pop());
        }
        System.out.println(sb);
    }
}
