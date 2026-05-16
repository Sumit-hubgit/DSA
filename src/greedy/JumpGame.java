package greedy;

public class JumpGame {
    public static void main(String[] args) {
        int[]arr={2,3,1,1,4};

        System.out.println(jump(arr,0,4));


    }

    static boolean jump(int[]arr,int st,int n){
        if(st==n-1){
            return true;
        }

        for (int i=1;i<arr[st];i++){
            if(jump(arr,st+i,n)){
                return true;
            }
        }
        return false;
    }
}
