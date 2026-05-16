package DailyProblemLeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Minimum_Number_of_Pushes_to_Type_Word_II {

    public static void main(String[] args) {
        String words= "xyzxyzxyzxyz";

        Map<Character,Integer>map=new HashMap<>();
        int n=words.length();
        for (int i=0;i<n;i++){
            map.put(words.charAt(i), map.getOrDefault(words.charAt(i),0)+1);
        }
        Integer []arr=map.values().toArray(new Integer[0]);
        Arrays.sort(arr,Collections.reverseOrder());
        int sum=0;
        for (int i=0;i<arr.length;i++){
            if(i<8){
                sum=sum+map.get(arr[i]);
            }
            if(i>=8 && i<16){
                sum=sum+2;
            }
            if(i>=16 && i<=23){
                sum=sum+3;
            }
            if(i>24){
                sum=sum+4;
            }
        }
        System.out.println(sum);
        System.out.println(map);
        System.out.println(Arrays.toString(arr));
    }
}
