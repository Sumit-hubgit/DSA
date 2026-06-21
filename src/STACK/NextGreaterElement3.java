package STACK;

import java.util.Stack;

public class NextGreaterElement3 {
    public static void main(String[] args) {
        int n=110;
        Stack<Integer>stack = new Stack<>();
        int temp =n;
        while(n>0){
            int num = n%10;
            if(!stack.isEmpty() && stack.peek()>num){
                int t = stack.pop();
                stack.push(num);
                stack.push(t);
                n=n/10;
                while(n>0){
                    stack.push(n%10);
                    n=n/10;
                }
                break;
            }
            stack.push(num);
            n=n/10;
        }
        int tens = 1;
        for(int i=0;i<stack.size()-1;i++){
            tens*=10;
        }
        int ans=0;
        while(!stack.isEmpty()){
            ans = ans + stack.pop()*tens;
            tens/=10;
        }
        System.out.println(ans);
    }
}
