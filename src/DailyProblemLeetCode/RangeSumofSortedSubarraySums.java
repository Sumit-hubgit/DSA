package DailyProblemLeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RangeSumofSortedSubarraySums {
    public static void main(String[] args) {
        int[]arr={1,2,3,4};
        int n=arr.length;

        ArrayList<Integer>list1=new ArrayList<>();
        int sum=0;
        for(int i=0;i<n;i++){
            sum=0;
            for (int j=i;j<n;j++){
                sum=sum+arr[j];
                list1.add(sum);
            }
        }
        Collections.sort(list1);
        System.out.println(list1);
    }
}
