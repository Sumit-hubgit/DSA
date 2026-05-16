package Recursion;

import java.util.ArrayList;

public class AllSubsetsInArray {

    static ArrayList<ArrayList<Integer>> list = new ArrayList<>();

    public static void main(String[] args) {
        int sum = 3;
        int[] arr = {1, 2, 3};
        ArrayList<Integer> temp = new ArrayList<>();
        fun(arr, 0, temp, arr.length);
    }

    public static void fun(int[] arr, int ind, ArrayList<Integer> tempList, int n) {
        if (ind >= n) {
            System.out.println(tempList);
            return;
        }
        tempList.add(arr[ind]);
        fun(arr, ind + 1, tempList, n);
        tempList.remove(tempList.size() - 1);  // Remove the last added element

        fun(arr, ind + 1, tempList, n);
    }
}
