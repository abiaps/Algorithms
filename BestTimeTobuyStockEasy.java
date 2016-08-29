public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0||prices.length==1)
        return 0;
        int min=prices[0];
        int maxDif=0;
         for(int i=1;i<=prices.length-1;i++)
         {
             min=Math.min(min,prices[i]);
             maxDif=Math.max(maxDif,prices[i]-min);
         }
      return maxDif;
    }
}
