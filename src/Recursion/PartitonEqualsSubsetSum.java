package Recursion;

import java.util.ArrayList;
import java.util.Collections;

public class PartitonEqualsSubsetSum {

    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        int[]arr={1,2,3,5};
        int sum=0;
        fun(arr,0,sum,list);
        Collections.sort(list);
        System.out.println(list);
    }

    static void fun(int[]arr, int ind, int sum, ArrayList<Integer>list){
        if(ind>= arr.length){
            list.add(sum);
            return;
        }
        fun(arr,ind+1,sum+arr[ind],list);
        fun(arr,ind+1,sum,list);
    }
}
