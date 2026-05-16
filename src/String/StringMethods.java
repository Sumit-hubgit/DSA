package String;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String s=" JAVA IS A OOP LANGUAGE  ";


        System.out.println(s.trim());
        String a=s.replace(" ","");

        System.out.println(s.indexOf('A'));
        System.out.println(a);

        System.out.println(s.substring(0,3));
        System.out.println(s.subSequence(0,3));
//        System.out.println(s.endsWith("VA"));
//        System.out.println(s.strip());
//        System.out.println(s.concat("a"));
//        System.out.println(s.contains("JV"));
//        char[]ch=s.toCharArray();
//        System.out.println(Arrays.toString(ch));
//        System.out.println(s.toLowerCase());
        int n=3;

        int[]arr=new int[n+1];

        for(int i=0;i<=n;i++){
            arr[i]=-1;
        }
        System.out.println(fibo(3,arr));
    }

    static int fibo(int n,int[]arr){
        if(n<2){
            return n;
        }
        if(arr[n]!=-1){
            return arr[n];
        }
        return arr[n]= fibo(n-1,arr)+fibo(n-2,arr);
    }
}
