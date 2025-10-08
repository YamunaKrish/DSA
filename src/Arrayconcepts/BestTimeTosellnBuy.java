package Arrayconcepts;

public class BestTimeTosellnBuy {
    public static void main(String[] args) {
        int[] val = {1,5,3,7,4};
        System.out.println(bestTime(val));
    }

    public static int bestTime(int[] val) {
       int buy=val[0];
       int maxprofit=0;
       for(int i=1;i<val.length;i++){
           if(val[i]<buy){
               buy=val[i];
           }
           else{
               int profit = val[i] -buy;
               if(maxprofit<profit){
                   maxprofit=profit;
               }
           }

           }
       return maxprofit;
       }
}
