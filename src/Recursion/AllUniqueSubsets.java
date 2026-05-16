package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class AllUniqueSubsets {

    static ArrayList<ArrayList<Integer>>list=new ArrayList<>();
    public static void main(String[] args) {

        int sum = 8;
        int[] arr = {10,1,2,7,6,1,5};
        Arrays.sort(arr);
        ArrayList<Integer> temp = new ArrayList<>();
        fun(arr,0,temp,sum);
        System.out.println(list);
    }

    static void fun(int[]arr,int i, ArrayList<Integer>temp,int sum){
        if(sum==0){
            list.add(new ArrayList<>(temp));
            return;
        }
        if(i>= arr.length){
            return;
        }
        temp.add(arr[i]);
        sum-=arr[i];
        fun(arr,i+1,temp,sum);
        temp.remove(temp.size()-1);
        sum+=arr[i];
        while (i+1< arr.length && arr[i]==arr[i+1]){
            i++;
        }
        fun(arr, i+1, temp,sum);
    }
}
