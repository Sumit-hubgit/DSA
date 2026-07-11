package STACK;

public class NextGreaerElement3 {
    public static void main(String[] args) {
        int n = 6537421;
        char[] digits = String.valueOf(n).toCharArray();
        int len = digits.length;

        // Step 1: Find the pivot
        int i = len - 2;
        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }

        // No greater permutation exists
        if (i < 0) {
            System.out.println(-1);
        }

        // Step 2: Find the smallest digit greater than pivot
        int j = len - 1;
        while (digits[j] <= digits[i]) {
            j--;
        }

        // Step 3: Swap
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;

        // Step 4: Reverse the suffix
        reverse(digits, i + 1, len - 1);

        // Convert back to number
        long ans = Long.parseLong(new String(digits));

        System.out.println(ans > Integer.MAX_VALUE ? -1 : (int) ans);
    }
    private static void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
