/*Q2. You are given an array prices where prices[i] is the price of a 
given stock on the ith day. */
public class MaxProfit {
   static int maxprofit(int price[]){
        int maxProfit=0;
        int minPrice=Integer.MAX_VALUE;
        for(int i=0;i<price.length;i++){
            if(price[i]<minPrice)
                minPrice=price[i];
            else if(price[i]-minPrice > maxProfit)
                maxProfit=price[i]-minPrice;
            
        }
        return maxProfit;

        
    }
    public static void main(String[] args){
        int[] price={7,1,4,5,6,3};
       int x= maxprofit(price);
       System.out.println("maximum profit is: "+x);
    }

}
