package SlidingWindow;

import java.util.HashMap;

public class Fruit_Into_Baskets {
    public static void main(String[] args) {
        int[]fruits = {3,3,3,1,2,1,1,2,3,3,4};
        int n = fruits.length;
        HashMap<Integer,Integer>map = new HashMap<>();
        int i=0,j=0;
        int max = Integer.MIN_VALUE;
        while(j<n){
            map.put(fruits[j],map.getOrDefault(fruits[j],0)+1);
            while(map.size()>=3){
                if(map.get(fruits[i])>1){
                    map.put(fruits[i],map.get(fruits[i])-1);
                }
                else{
                    map.remove(fruits[i]);
                }
                i++;
            }
            max = Math.max(max,j-i+1);
            j++;
        }
        System.out.println(max);
    }
}
