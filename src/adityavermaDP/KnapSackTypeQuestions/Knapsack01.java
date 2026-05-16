package adityavermaDP.KnapSackTypeQuestions;

import java.util.Arrays;

public class Knapsack01 {
    public static void main(String[] args) {
        int[]wt={10,20,30};
        int[]val={60,100,120};
        int W=50;
        System.out.println(knap(wt,val,W));
    }

    static int knap(int[]wt,int[]val,int W){
        if(wt.length==0 || W==0){
            return 0;
        }
        if(wt[0]<=W){
            return Math.max(val[0]+knap(Arrays.copyOfRange(wt,1,wt.length),Arrays.copyOfRange(val,1,val.length),W-wt[0]),knap(Arrays.copyOfRange(wt,1,wt.length),Arrays.copyOfRange(val,1,val.length),W));
        }
        else {
            return knap(Arrays.copyOfRange(wt,1,wt.length),Arrays.copyOfRange(val,1,val.length),W);
        }
    }
}
