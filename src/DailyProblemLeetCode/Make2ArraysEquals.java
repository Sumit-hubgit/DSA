package DailyProblemLeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Make2ArraysEquals {
    public static void main(String[] args) {
        int[]arr={2,4,1,3};
        int[]target={1,2,3,4};
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(target[i], map.getOrDefault(target[i],0)+1);
        }
        for (int i=0;i<target.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])-1);
                if(map.get(arr[i])==0) {
                    map.remove(arr[i]);
                }
            }
        }
        System.out.println(map.size());
        if(map.size()==0){
            System.out.println("Present");
        }
    }
}
