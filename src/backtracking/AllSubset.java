package backtracking;

import java.util.ArrayList;

public class AllSubset {

    static ArrayList<ArrayList<Integer>>list=new ArrayList<>();

    public static void main(String[] args) {

        int[]arr={1,2,3};
        function(arr,new ArrayList<>(),0);
        System.out.println(list);
    }

    static void function(int[]arr,ArrayList<Integer>ans,int i){
        if(i==arr.length){
            list.add(new ArrayList<>(ans));
            return;
        }
        for (int j = i; j < arr.length; j++) {
            ans.add(arr[j]);
            function(arr, ans, j+1);
            ans.remove(ans.size()-1);

        }
    }
}
