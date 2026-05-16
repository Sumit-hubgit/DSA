package DynamicProgramming;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n=4;
        int[] arr=new int[n+1];
        int ind=0;
        int ans=climb(n,arr);
        System.out.println(ans);

    }
    static int climb(int n,int[]arr){

        if(arr[n]!=0){
            return arr[n];
        }
        if(n==2){
            return 2;
        }
        if(n==1){
            return 1;
        }
        return arr[n]= climb(n-1,arr) + climb(n-2,arr);
    }
}
