package SlidingWindow;

import java.util.*;

public class FirstNegative {
    public static void main(String[] args) {

        int[]arr={12, -1, -7, 8, -15, 30, 16, 28};
        Queue<Integer>queue = new LinkedList<>();
        int i=0,j=0;
        int n= arr.length;
        int k=3;
        ArrayList<Integer>list=new ArrayList<>();

        while (j<n){
            if(arr[j]<0){
                queue.add(arr[j]);
            }
            if(j-i+1==k){
               if(queue.size()!=0){
                   list.add(queue.peek());
               }
               else {
                   list.add(0);
               }
                if(arr[i]<0 && arr[i]==queue.peek()){
                    queue.remove();
                }
                i++;
            }
            j++;
        }
        System.out.println(list);
    }
}
