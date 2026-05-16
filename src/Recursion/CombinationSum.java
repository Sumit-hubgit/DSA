package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class CombinationSum {

    public static void main(String[] args) {
        int[]arr={2,3,4,7};
        ArrayList<Integer>list=new ArrayList<>();
        int sum=7;
        int n=arr.length;
        int ind=0;
        fun(arr,list,ind,n,sum);
    }

    public static void fun(int[]arr,ArrayList<Integer>list,int ind,int n,int sum){
        if(sum==0){
            System.out.println(list);
            return;
        }
        if(ind>=n){
            return;
        }
        if(arr[ind]<=sum){

            list.add(arr[ind]);
            sum=sum-arr[ind];
            fun(arr,list,ind,n,sum);
            list.remove(list.size()-1);
            sum=sum+arr[ind];
        }
        fun(arr,list,ind+1,n,sum);
    }
}
