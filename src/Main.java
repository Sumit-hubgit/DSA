import java.util.*;

public class Main {
    public static void main(String[] args) {
       int[]arr= {-2, 2, 4, 4, 4, 4, 5, 5};
       int count=0;

       for(int i=0;i<arr.length-1;i++){
           if(arr[i]==arr[i+1]){
               arr[i]=-1;
           }
           else{
               count++;
           }
       }
        System.out.println(Arrays.toString(arr));
        System.out.println(count+1);
    }
}
