package DailyProblemLeetCode;

import java.util.Arrays;

public class Meeting_Rooms_III {
    public static void main(String[] args) {
        int t=10;
        int[][]mat = {
             {0,10},
             {1,5},
             {2,7},
             {3,4}
        };
        int n=2;
        int[]room = new int[n];
        Arrays.fill(room,-1);
        int l= mat.length;
        int[]ans=new int[n];
        for(int i=0;i<t;i++){
            int check = isEmpty(room,t);
             if(check!=-1){
                 if(room[check]!=-1 && check<n){
                     room[check]+= mat[i][1]-mat[i][0];
                     ans[check]++;
                 }
                 else {
                     room[check]=mat[i][1];
                     ans[check]++;
                 }
             }
        }
        System.out.println(Arrays.toString(ans));
    }

    public static int isEmpty(int[]room,int t){
        for (int i=0;i<room.length;i++){
            if(room[i]==-1 || room[i]<=t){
                return i;
            }
        }
        return -1;
    }
}
