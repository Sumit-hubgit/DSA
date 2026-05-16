package adityavermaDP.KnapSackTypeQuestions;

import java.util.ArrayList;

public class TargetSum {
    /*
    Array di huwi hai uske elementspar sign lagana hai + ya minus ka such that sum = 0  hojae
    or uska count return karna hai.
     */

    public static void main(String[] args) {
        int[]arr={1,1,2,3};
        int n=arr.length;
        int sum=3,currSum=0;
        ArrayList<Integer>list=new ArrayList<>();
        System.out.println(target(arr,n,sum,currSum,list));
//        System.out.println(targetSum(arr,n,sum,currSum));
    }
    static int targetSum(int[]arr,int n,int sum,int currSum){
        if(currSum==sum){
            return 1;
        }
        if(n==0){
            return 0;
        }
        return targetSum(arr,n-1,sum,currSum+arr[n-1]) + targetSum(arr, n-1, sum, currSum-arr[n-1]);
    }


    static ArrayList<Integer>target(int[]arr,int n,int sum,int currsum,ArrayList<Integer>ls){
        if(n-1==0){
            return new ArrayList<>();
        }
        if(sum==currsum){
            return ls;
        }
        if(sum>currsum){
            ls.add(arr[n-1]);
            ArrayList result= target(arr,n-1,sum,currsum+arr[n-1],ls);
            ls.removeLast();
            target(arr,n-1,sum,currsum,ls);
        }
        return  ls;
    }
}
