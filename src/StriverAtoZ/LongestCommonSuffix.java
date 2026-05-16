package StriverAtoZ;

import java.util.Arrays;

public class LongestCommonSuffix {

    public static void main(String[] args) {

        System.out.println("Hello World");
        String[]arr={"under","under","und"};
        Arrays.sort(arr);

        int i=0,j=0,c=0;
        while (c!=1){
            if(i>arr[0].length()){
                break;
            }
            if(arr[0].charAt(i)==arr[arr.length-1].charAt(i)){
                j++;
                i++;
            }
            else {
                c=1;
            }
        }
        System.out.println(j);
        System.out.println(Arrays.toString(arr));



    }

}
