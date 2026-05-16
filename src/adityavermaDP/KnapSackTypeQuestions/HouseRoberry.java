package adityavermaDP.KnapSackTypeQuestions;

public class HouseRoberry {
    public static void main(String[] args) {
        int[]arr={2,7,9,3,1};
        int n= arr.length;
        System.out.println(fun(arr,n));
    }

    static int fun(int[]arr , int n){
        if(n<=0){
            return 0;
        }
        return Math.max(arr[n-1]+fun(arr,n-2), fun(arr,n-1));
    }
}
