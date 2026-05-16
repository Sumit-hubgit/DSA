package input;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * The first line contains an integer, N., denoting the number of elements in A.
 * The next line contains an integer, X, denoting the cost of the first operation.
 * The next line contains an integer. Y, denoting the cost of the second operation
 * Each line i of the N subsequent lines (where 1 <=i<= N) contains an Integer describing Ai.
 */
public class LearnInput {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int key = sc.nextInt();
            String value = sc.nextLine();

            map.put(key, value);
        }
        System.out.println(map);
    }
}
