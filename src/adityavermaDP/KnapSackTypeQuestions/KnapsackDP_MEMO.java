package adityavermaDP.KnapSackTypeQuestions;

public class KnapsackDP_MEMO{

    public static void main(String[] args) {

        int[]wt={10,20,30};
        int[]val={60,100,120};
        int W=50;
        int n=wt.length;
        int[][]matrix = new int[n+1][W+1];
        for (int i=0;i<=n;i++){
            for (int j=0;j<=W;j++){
                matrix[i][j]=-1;
            }
        }

        System.out.println(knap(wt,val,W,n,matrix));
    }
    static int knap(int[]wt,int []val,int W,int n,int[][]matrix){
        if(n==0 ||W==0){
            return 0;
        }
        if(matrix[n][W]!=-1){
            return matrix[n][W];
        }
        if(wt[n-1]<=W){
            return matrix[n][W]=Math.max(val[n-1]+ knap(wt,val,W-wt[n-1],n-1,matrix),knap(wt,val,W-wt[n-1],n-1,matrix));
        }
        else {
            return matrix[n][W]=knap(wt,val,W-wt[n-1],n-1,matrix);
        }
    }
}
