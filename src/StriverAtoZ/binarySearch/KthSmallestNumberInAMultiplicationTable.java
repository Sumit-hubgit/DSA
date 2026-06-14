package StriverAtoZ.binarySearch;

public class KthSmallestNumberInAMultiplicationTable {
    public static void main(String[] args) {
        int m =3,n=3;
        int start = 1;
        int end = m*n;
        int ans = 0;
        int k=5;

        while(start<=end){
            int mid = start + (end-start)/2;

            boolean valid  = helper(mid,k,n,m);
            if(valid){
                ans = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        System.out.println(ans);
    }
    public static boolean helper(int num, int k, int n, int m) {
        int count = 0;
        for (int i = 1; i <= m; i++) {
            count += Math.min(num / i, n);
        }
        return count >= k;
    }
}
