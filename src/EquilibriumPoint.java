import java.util.Arrays;

public class EquilibriumPoint {
    public static void main(String[] args) {
        int[]arr = {1,2,0,3};

        int n = arr.length;
        int ts = 0;
        if(n<3){
            System.out.println("-1");
        }
        int[]sumarray = new int[n];
        sumarray[0]=arr[0];
        for(int i=1;i<n;i++){
            sumarray[i]=arr[i]+sumarray[i-1];
            ts=ts+arr[i];
        }
        ts=ts+arr[0];
        System.out.println(ts);
        System.out.println(Arrays.toString(sumarray));
        for(int i=1;i<n;i++){
            int ls = sumarray[i-1];
            int rs = ts-(ls+arr[i]);
            if(ls==rs){
                System.out.println(i);
            }
        }
    }
}
