package CodeVita;

public class OnlineShopping {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int[]arr=                                   {8 ,3, 6, 22 ,5 ,0 , 11, 1 , 0 , 4 , 9 ,6};
        int[]pick=                                   {0 ,1 ,0 ,1 , 1 ,0 ,  1 ,0 , 1 , 0 , 0, 0};
        int i=0,j=0,n=arr.length;
        int max=Integer.MIN_VALUE;
        int limit=3;
        int sum=0;
        while(j<n){

            if(pick[j]==0){
                int k=j,count=0;
                while(k<n &&pick[k]==0 && count<limit){
                    if(pick[k]==1){
                        break;
                    }
                    if(count<limit) {
                        sum = sum + arr[k];
                        count++;
                    }
                    k++;
                }
                max=Math.max(max,sum);
                count=0;
                sum=0;
            }
            j++;
        }
        for(i=0;i<n;i++){
            if(pick[i]==1){
                max=max+arr[i];
            }
        }

        System.out.println(max);
    }
}
