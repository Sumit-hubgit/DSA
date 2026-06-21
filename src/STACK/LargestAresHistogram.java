package STACK;

import java.util.Arrays;
import java.util.Stack;

public class LargestAresHistogram {
    public static void main(String[] args) {
        int[]arr = {2,1,5,6,2,3};
        int n = arr.length;
        int[]right =rightBoundary(arr);
        int[]left = leftBoundary(arr);
        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            int width = right[i] - left[i] + 1;
            int area = arr[i] * width;
            maxArea = Math.max(maxArea, area);
        }
        System.out.println(maxArea);

    }

    public static int[] rightBoundary(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        int[] ans = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] <= arr[stack.peek()]) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                ans[i] = stack.peek() - 1;
            } else {
                ans[i] = n - 1;
            }

            stack.push(i);
        }
        return ans;
    }
    public static int[] leftBoundary(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[i] <= arr[stack.peek()]) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                ans[i] = stack.peek() + 1;
            } else {
                ans[i] = 0;
            }

            stack.push(i);
        }
        return ans;
    }
}
