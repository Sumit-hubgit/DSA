package DailyProblemLeetCode;

import java.util.HashMap;
import java.util.Map;

public class Kth_Distinct_String_in_an_Array {

    public static void main(String[] args) {
        String[]arr={"aaa","aa","a"};
        HashMap<String,Integer>map=new HashMap<>();
        int n=arr.length;
        for (int i=0;i<n;i++){
            if(map.containsKey(arr[i])==true){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else {
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }
        }
        int k=2;
        int l = map.size();
        for (int i=0;i<n;i++){
            if(map.get(arr[i])==1){
                if(k==1){
                    System.out.println(arr[i]);
                    break;
                }
                else {
                    k--;
                }
            }
        }
    }
}
