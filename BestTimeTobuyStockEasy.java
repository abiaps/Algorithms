public class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0||prices.length==1)
        return 0;
        if(prices.length==2)
        {
            if((prices[1]-prices[0])>0)
            
                return prices[1]-prices[0];
            else
                return 0;
        }
        int min=prices[0];
        int min_ind=0;
        int min2=min;
        int min2_ind=min_ind;
        
         for(int i=1;i<=prices.length-2;i++)
         {
             if(prices[i]<min)
             {
                 min2=min;
                 min=prices[i];
                 min2_ind=min_ind;
                 min_ind=i;
                 
             }
         }
      
         int max1=min;
         int max2=min2;
         for(int j=min_ind+1;j<=prices.length-1;j++)
         {
             if(prices[j]>max1)
             {
                 max1=prices[j];
             }
         }
          for(int k=min2_ind+1;k<=prices.length-1;k++)
         {
             if(prices[k]>max2)
             {
                 max2=prices[k];
             }
         }
         max1=max1-min;
         max2=max2-min2;
         if(max1>=max2)
         return max1;
         else
         return max2;
    }
}
