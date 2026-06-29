package STACK;

import java.util.Stack;

public class RemoveAdjacentDuplicate2 {
    public static void main(String[] args) {
        String s = "pbbcggttciiippooaais";
        Stack<Character> stack = new Stack<>();
        Stack<Character> helper = new Stack<>();
        int k = 2;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            stack.push(ch);
            if (stack.size() >= k) {
                helper.push(stack.pop());
                int count = 1;
                while (!stack.isEmpty() && (helper.peek().equals(stack.peek())) && count <= k) {
                    helper.push(stack.pop());
                    count++;
                }
                if (helper.size() >= k) {
                    helper.clear();
                } else {
                    while (!helper.isEmpty()) {
                        stack.push(helper.pop());
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        int l = stack.size();
        for (int i = 0; i < l; i++) {
            sb = sb.append(stack.pop());
        }
        StringBuilder ans = new StringBuilder();
        for (int i = sb.length() - 1; i >= 0; i--) {
            ans = ans.append(sb.charAt(i));
        }
        System.out.println(ans);
    }

    public String removeDuplicates(String s, int k) {
        Stack<int[]> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek()[0] == ch) {
                stack.peek()[1]++;
            } else {
                stack.push(new int[]{ch, 1});
            }
            if (stack.peek()[1] == k) {
                stack.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            int top[] = stack.pop();
            while (top[1]-- > 0)
                sb.append((char) top[0]);
        }
        return sb.reverse().toString();
    }
}
