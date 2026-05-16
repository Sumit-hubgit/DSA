package StriverAtoZ;

public class SpiralMatrix {

    public static void main(String[] args) {
        int[][]mat={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}

        };

        int rowebegin=0,colbegin=0;
        int rowend=mat.length-1,colend=mat[0].length-1;

        while (rowebegin<=rowend && colbegin<=colend){

            for (int j=rowebegin;j<=colend;j++){
                System.out.println(mat[rowebegin][j]);
            }
            rowebegin++;

            for (int j=colend;j<=rowend;j++){
                System.out.println(mat[j][colend]);
            }
            colend--;

            if(rowebegin<=rowend){
                for (int j=colend;j>=colbegin;j--){
                    System.out.println(mat[rowend][j]);
                }
                rowend--;

            }
            if(colbegin<=colend){
                for (int j = rowend; j > rowebegin; j--) {
                    System.out.println(mat[j][colbegin]);
                }
                colbegin++;
            }
        }

    }
}
