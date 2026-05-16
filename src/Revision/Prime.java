package Revision;

import java.util.ArrayList;
import java.util.Arrays;

public class Prime {

    public static void main(String[] args) {
        int num=18;

        int[]arr=new int[num];
        System.out.println(primeFactors(num));
//        System.out.println(Arrays.toString(allPrime(num)));


    }

    static ArrayList<Integer> primeFactors(int num){
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=2;i<num;i++){
            if(num%i==0 && isPrime(i)==true){
                list.add(i);
            }
        }
        return list;
    }

    static  int[] allPrime(int num){
        int flag=0,k=0;
        int[]arr=new int[num];
        for(int i=2;i<=num;i++){
            flag=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                arr[k]=i;
                k++;
            }
        }
        return arr;
    }


    static boolean isPrime(int num){
        int flag=0;
        for(int i=2;i<num;i++){
            if(num%i==0){
                flag=1;
                break;
            }
        }
        if(flag==1){
            return false;
        }
        else {
            return true;
        }
    }

}
