package takeUforwardPlus;

import java.util.ArrayList;
import java.util.Arrays;

public class KequalSubarray {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] arr = {1, 2, 3, 4, 5, 6,7,8,9};
        int k = 3;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i += k) {
            ArrayList<Integer> tep = new ArrayList<>();
            for (int j = i; j < i + k; j++) {
                tep.add(arr[j]);
            }
            list.add(tep);
        }
        System.out.println(Arrays.toString(new ArrayList[]{list}));
    }
}
