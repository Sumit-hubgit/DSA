package StriverAtoZ.binarySearch;

public class KoKoEaingBanana {
    public static void main(String[] args) {
        int[]piles ={3,6,7,11};
        int h = 8;
        int max = Integer.MIN_VALUE;
        int ans = Integer.MAX_VALUE;
        int n = piles.length;
        for(int i=0;i<n;i++){
            max = Math.max(max,piles[i]);
        }
        int start = 1;
        int end = max;
        while(start<=end){
            int mid = start + (end-start)/2;
            int valid = fun(mid,piles);
            if(valid==h){
                ans=mid;
                end=mid-1;
            }
            else if(valid<h){
                ans=mid;
                end=mid-1;
            }
            else{
                start= mid+1;
            }
        }
        System.out.println(ans);
    }

    public static int fun(int num,int[]piles){
        int result = 0;
        for(int i=0;i<piles.length;i++){
            result = result + (piles[i] + num - 1) / num;
        }
        return result;
    }
}
