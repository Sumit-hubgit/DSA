package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Permutation {
    static ArrayList<ArrayList<Integer>>ans=new ArrayList<>();

    public static void main(String[] args) {
        int[]arr={1,2,3};
        boolean[]flag=new boolean[arr.length];
        ArrayList<Integer>list=new ArrayList<>();
        Arrays.fill(flag,false);
        permutation(arr,flag,list);
        System.out.println(ans);
    }

    static void  permutation(int[]arr,boolean[]flag,ArrayList<Integer>list){
        if(list.size()==arr.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if(!flag[i]){
                list.add(arr[i]);
                flag[i]=true;
                permutation(arr,flag,list);
                list.remove(list.size()-1);
                flag[i]=false;
            }
        }
    }
}
