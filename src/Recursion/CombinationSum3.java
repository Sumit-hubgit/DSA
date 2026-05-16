package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CombinationSum3 {
    public static void main(String[] args) {
        int numbers=1;
        int k=3;
        int sum=9;
        List<List<Integer>> list = new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        fun(numbers,k,sum,temp,list);
        System.out.println(list);


    }

    static void  fun(int numbers,int k,int sum,List<Integer>temp,List<List<Integer>>ans){
        if(sum==0){
            if(temp.size()==k){
                ans.add(new ArrayList<>(temp));
                return;
            }
        }
        if(numbers>9){
            return;
        }
//        if(sum>numbers){
//            return;
//        }
        if(numbers<=sum){
            sum=sum-numbers;
            temp.add(numbers);
            fun(numbers+1,k,sum,temp,ans);
            sum=sum+numbers;
//            numbers--;
            temp.remove(temp.size()-1);

        }
        fun(numbers+1,k,sum,temp,ans);
    }
}
