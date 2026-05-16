package takeUforwardPlus;

import java.util.HashMap;

public class SubstringWithKmostChar {
    public static void main(String[] args) {
        String s = "aababbcaacc";
        int k = 2;
        int i=0,j=0;
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        while(j<n){
            char ch = s.charAt(j);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else if(!map.containsKey(ch) && map.size()<k){
                map.put(ch,1);
            }
            else if(!map.containsKey(ch) && map.size()==k){
                while(map.size()==k){
                    char c = s.charAt(i);
                    map.put(c,map.get(c)-1);
                    if(map.get(c)==0){
                        map.remove(c);
                    }
                    i++;
                }
                map.put(ch,1);
            }

            max=Math.max(max , j-i+1);
            j++;
        }
        System.out.println(max);
    }
}
