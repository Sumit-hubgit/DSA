package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tr {

    public static void main(String[] args) {
        int[]arr={1,2,3};
        int sum=3;
        List<List<Integer>>list=new ArrayList<>();
        List<Integer>ans=new ArrayList<>();
        fun(arr,sum,list,ans);
        System.out.println(list);
    }

    static void fun(int[]arr, int sum, List<List<Integer>>list,List<Integer>ans){
        if(sum==0){
            list.add(new ArrayList<>(ans));
            return;
        }
        if (arr.length==0){
            return;
        }
        if(arr[0]<=sum){
            ans.add(arr[0]);
            fun(Arrays.copyOfRange(arr,1,arr.length),sum-arr[0],list,ans);

                ans.remove(ans.size() - 1);

        }
        fun(Arrays.copyOfRange(arr,1,arr.length),sum,list,ans);
    }
}
