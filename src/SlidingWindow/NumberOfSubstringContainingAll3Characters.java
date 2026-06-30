package SlidingWindow;

import java.util.HashMap;

public class NumberOfSubstringContainingAll3Characters {
    public static void main(String[] args) {
        String s ="acbbcac";
        int n = s.length();
        HashMap<Character,Integer> map= new HashMap<>();
        int i=0;
        int j=0;
        int count=0;
        while(j<n){
            char ch = s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            if(map.size()==3){
                count = count+ n-j-1;
                while(map.size()==3){
                    char c = s.charAt(i);
                    map.put(c,map.get(c)-1);
                    count++;
                    if(map.get(c)==0){
                        map.remove(c);
                    }
                    i++;
                }
            }
            j++;
        }
        System.out.println(count);
    }
}
