package SlidingWindow;


import java.util.HashMap;

public class CountSubstringVowels {
    public static void main(String[] args) {
        String str = "abiaeoubaaaa";
        HashMap<Character,Integer>map = new HashMap<>();
        int i=0,j=0;
        int res = 0;
        int n =str.length();
        while(j<n){
            char ch = str.charAt(j);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                map.put(ch, map.getOrDefault(ch,0)+1);
            }
            while(map.size()>=5){
                char c = str.charAt(i);
                map.put(c,map.get(ch)-1);
                if(map.get(c)==0){
                    map.remove(c);
                }
                res = res+n-j;
                i++;
            }
            j++;
        }

        System.out.println(res);
    }
}
