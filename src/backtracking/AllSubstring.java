package backtracking;

import java.util.ArrayList;

public class AllSubstring {
    static ArrayList<ArrayList<String>>list=new ArrayList<>();

    public static void main(String[] args) {

        String str="aab";
        palindrome(str,new ArrayList<>(),0);
        System.out.println(list);

    }


    static void palindrome(String p ,ArrayList<String>ans,int i){
        if(i==p.length()){

            list.add(new ArrayList<>(ans));
            return;
        }
        for (int j=i;j<p.length();j++){
            ans.add(p.substring(i,j+1));
            palindrome(p,ans,j+1);
            ans.remove(ans.size()-1);
        }
    }
}
