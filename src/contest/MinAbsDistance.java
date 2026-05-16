package contest;

import java.util.HashMap;

public class MinAbsDistance {

    public static void main(String[] args) {
        int[]nums = {21,120};
        int n = nums.length;

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],i);
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int mirr = mirror(nums[i]);
            if(map.containsKey(mirr)){
                int j =map.get(mirr);
                if(i<j){
                    ans = Math.min(ans,Math.abs(j-i));
                }
            }
        }
        System.out.println(ans);
    }

    public static int  mirror(int dig){
        String s = String.valueOf(dig);
        StringBuilder sb = new StringBuilder();
        int i=s.length()-1;
        while(s.charAt(i)=='0'){
            i--;
        }
        sb.append(s, 0, i+1);


        int t=i;
        for(int j=0;j<=i/2;j++){
            char temp = sb.charAt(t);
            sb.setCharAt(t, sb.charAt(j));
            sb.setCharAt(j, temp);

        }
        return Integer.parseInt(sb.toString());
    }
}
