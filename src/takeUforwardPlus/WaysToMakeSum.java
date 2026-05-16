package takeUforwardPlus;

public class WaysToMakeSum {
    public static void main(String[] args) {
        int[]arr= {1,2,6,4,4};
        int n=5;
        int ans=  func(arr,0,n,0,0);
        System.out.println(ans);
    }


    public static int func(int[]arr,int i , int target,int sum,int used){
        if(arr.length==0 || i==arr.length || target==0 || sum>target){
            return 0;
        }
        if(sum==target) {
            return 1;
        }

        if(arr[i]<=target){
            if(arr[i]==4 && used<2){
                return func(arr,i+1,target,sum+arr[i],used+1);
            }
            else{
                return func(arr,i,target,sum+arr[i],used) +  func(arr,i+1,target,sum+arr[i],used);
            }
        }
        else{
            return func(arr,i+1,target,sum,used);
        }
    }
}
