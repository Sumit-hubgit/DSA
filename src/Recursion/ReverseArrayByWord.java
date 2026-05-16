package Recursion;

import java.util.Arrays;

public class ReverseArrayByWord {

    public static void main(String[] args) {

        String str="Hello World ";
        String[]arr = str.split(" ");

        for (int m=0;m<arr.length;m++){
            arr[m]=check(arr[m]);
        }
        System.out.println(Arrays.toString(arr));

    }

    static String check(String str){
        int i=str.length()-1;
        String ans="";
        while (i>=0){
            ans+=str.charAt(i);
            i--;
        }
        return ans;
    }
}
