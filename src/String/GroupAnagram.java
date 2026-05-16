package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        String[] original = str.clone(); // Clone the original array to preserve original strings

        // Sort each string to group anagrams
        for (int i = 0; i < str.length; i++) {
            char[] ch = str[i].toCharArray();
            Arrays.sort(ch);
            str[i] = new String(ch);  // Convert char[] back to string
        }

        HashMap<String,List<String>>map =new HashMap<>();
        for(int i=0;i< str.length;i++){
            if(!map.containsKey(str[i])){
                List<String>list =new ArrayList<>();
                list.add(original[i]);
                map.put(str[i],list);
            }
            else{
                map.get(str[i]).add(original[i]);
            }
        }
        System.out.println(new ArrayList<>(map.values()));
    }
}
