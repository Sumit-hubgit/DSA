public class Forts {

    public static void main(String[] args) {

        int[] forts={1,0,0,-1,0,0,-1,0,0,1};
        int i=0,j=1,zeroes=0;
        int ans=0,n=forts.length;
        while(j<n){
            if(forts[j]==1 || forts[j]==-1){
                if((forts[i]==1 || forts[i]==-1 ) && forts[i]!=forts[j]){
                    ans=Math.max(ans,zeroes);
                    zeroes=0;
                }
                i=j;
            }
            else if((forts[i]==1 || forts[i]==-1) &&forts[j]==0){
                zeroes++;
            }
            j++;
        }
        System.out.println(ans);
    }
}


class Solution {
    public int captureForts(int[] forts) {
        int i = 0, j = 1, zeroes = 0;
        int ans = 0, n = forts.length;

        while (j < n) {
            // If we find a fort at j (either 1 or -1)
            if (forts[j] == 1 || forts[j] == -1) {
                // Check if i and j have forts of opposite types
                if ((forts[i] == 1 || forts[i] == -1) && forts[i] != forts[j]) {
                    ans = Math.max(ans, zeroes);
                }
                // Reset zeroes and move i to j
                zeroes = 0;
                i = j;
            }
            // Count enemy forts between two different forts
            else if ((forts[i] == 1 || forts[i] == -1) && forts[j] == 0) {
                zeroes++;
            }
            j++;
        }
        return ans;
    }
}
