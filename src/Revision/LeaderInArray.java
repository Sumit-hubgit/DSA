package Revision;

import java.util.ArrayList;

public class LeaderInArray {
    public static void main(String[] args) {
        int[]arr={12, 27, 14, 11, 25, 6, 7};

        ArrayList<Integer>list=new ArrayList<>();
        int n=arr.length;
        list.add(arr[n-1]);
        int max=arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(arr[i]>max){
                list.add(arr[i]);
                max=arr[i];
            }
        }
        System.out.println(list);
    }
}
