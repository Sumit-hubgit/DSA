public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[]arr={-3,0,1,-2};
        int max=Integer.MIN_VALUE;
        int n=arr.length;
        int prefix=1,suffix=1;
        int i=0,j=n-1;
        while (i<n && j>=0){
            if(arr[i]==0){
                prefix=1;
            }
            if(arr[j]==0){
                suffix=1;
            }
            prefix=prefix*arr[i];
            suffix=suffix*arr[j];
            int t=Math.max(prefix,suffix);
            max=Math.max(t,max);
            i++;
            j--;
        }
        System.out.println(max);
    }
}
