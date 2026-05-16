package Revision;

public class GCD {
    public static void main(String[] args) {
        int []arr={56,98};
        int result=arr[0];
        for (int i=1;i<arr.length;i++){
            result=gcd(result,arr[i]);
        }
        System.out.println(result);

    }
    static int gcd(int a,int b){
        while (b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
