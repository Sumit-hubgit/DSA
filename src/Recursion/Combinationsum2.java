//package Recursion;
//import java.util.ArrayList;
//import java.util.*;
//import java.util.Set;
//
//public class Combinationsum2 {
//    static Set<ArrayList<Integer>> list = new ArrayList<>();
//
//    public static void fun(int[] arr, ArrayList<Integer> temp, int ind, int n, int sum) {
//        if (sum == 0) {
//
//            if (!list.contains(new ArrayList<>(temp))) {
////                Collections.sort(temp);
//                list.add(new ArrayList<>(temp));
//            }
//            return;
//        }
//        if (ind >= n) {
//            return;
//        }
//        if (arr[ind] <= sum) {
//            temp.add(arr[ind]);
//            fun(arr, temp, ind + 1, n, sum - arr[ind]);
//            temp.remove(temp.size() - 1);
//        }
//        fun(arr, temp, ind + 1, n, sum);
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {2, 5, 2, 1, 2};
//        int sum = 5;
//        ArrayList<Integer> temp = new ArrayList<>();
//        fun(arr, temp, 0, arr.length, sum);
//        System.out.println(list);
//    }
//}
