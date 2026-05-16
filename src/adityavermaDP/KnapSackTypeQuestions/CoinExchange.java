//package adityavermaDP;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//
//public class CoinExchange {
//    public static void main(String[] args) {
//        int[]coins={1,2,5};
//        int amount=11;
//        int n= args.length;
//        ArrayList<Integer>list=new ArrayList<>();
//        coin(coins,amount,n,list,0);
//        System.out.println(list);
//    }
//    static int coin(int[]coins, int amount, int n, ArrayList<Integer>list,){
//        if(amount==0){
//            list.add();
//            return;
//        }
//        if(n==0){
//            return;
//        }
//        if(coins[n-1]<=amount){
//            coin(coins,amount-coins[n-1],n,list,count++);
//
//            coin(coins,amount-coins[n-1],n-1,list,count++);
//
//            coin(coins,amount,n-1,list,count);
//        }
//        else {
//            coin(coins,amount,n-1,list,count);
//        }
//    }
//}
