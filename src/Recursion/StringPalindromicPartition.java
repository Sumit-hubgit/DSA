package Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class StringPalindromicPartition {
    static ArrayList<String>temp=new ArrayList<>();
    public static void main(String[] args) {
        String p=" ";
        String up="aab";
        ArrayList<String>ans=new ArrayList<>();
        sub(p,up);
        System.out.println(temp);

        for (int i = 0; i < temp.size(); i++) {
            for (int j = 0; j < temp.size(); j++) {
                String str = temp.get(i) + temp.get(j);
                if (str==up) {
                    ans.add(temp.get(i));
                    ans.add(temp.get(j));
                }
            }
        }
        System.out.println(ans);

    }

    static void sub(String p, String up){
        if(up.isEmpty()==true){
            System.out.println(p);
            temp.add(p);
            return;
        }

        sub(p+up.charAt(0),up.substring(1));
        sub(p,up.substring(1,up.length()));
    }
}
