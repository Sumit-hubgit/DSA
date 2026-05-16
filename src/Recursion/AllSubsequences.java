package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class AllSubsequences {

    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);

        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)==list.get(i+1)){
                list.remove(list.get(i));
            }

        }
        System.out.println(list);
    }
}
