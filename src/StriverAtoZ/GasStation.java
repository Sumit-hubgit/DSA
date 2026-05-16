package StriverAtoZ;

public class GasStation {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,1,2,3,4,5};
        int[]cost={3,4,5,1,2,3,4,5,1,2};
        int n=arr.length;
        for (int i=0;i<n;i++){
            int j=i;
            int st=arr[i];
            int end=Integer.MIN_VALUE;
            int sum=0;
            while (j<n) {
                sum = sum + arr[i] - cost[j];
                if (sum < 0) {
                    break;
                }
                end=arr[j];
                j++;
            }
            if(end==st){
                System.out.println(end);
                break;
            }
        }

    }
}
