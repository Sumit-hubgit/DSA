package LeetCode75;

public class LongestSubarrayAfterRemoving1 {
    public static void main(String[] args) {
        int[]arr={0,1,1,1,0,1,1,0,1};
        int i=0,count=0,max=-1;

        boolean flag=false;
        int n=arr.length;
        int p=0;
        while(i<n){
            if(arr[i]==0 && flag==false){
                flag=true;
                p=i;
                i++;
                continue;
            }
            else if(arr[i]==1){
                count++;
            }
            else if(arr[i]==0 && flag==true){
                count=i-p-1;
                p=i;
            }
            else{

            }
            max=Math.max(max,count);
            i++;
        }
        System.out.println(max);
    }
}
