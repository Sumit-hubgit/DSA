package SlidingWindow;

import java.util.HashMap;

public class LongestRepeatingCharacter {

    public static void main(String[] args) {

        String str="tmmzuxt";
        HashMap<Character,Integer> map=new HashMap<>();
        int i=0,j=0,max=0;
        int n=str.length();

        while(j<n){
            Character ch=str.charAt(j);

            if(map.containsKey(ch)==false){

                map.put(ch,1);
            }
            else{
                while(str.charAt(i)!=str.charAt(j)){
                    i++;
                }
                i++;
            }
            max=Math.max(max,j-i+1);
            j++;
        }
        System.out.println(max);
    }
}
