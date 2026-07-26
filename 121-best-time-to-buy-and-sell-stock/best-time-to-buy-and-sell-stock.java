class Solution {
    public int maxProfit(int[] prices) {
        int buyP = prices[0];
        int profit =0;

        for(int i=1;i<prices.length;i++){
            int curp =prices[i];
            if(curp<buyP) buyP =curp;
            profit=Math.max(profit,curp-buyP);    
        }
        return profit;
    }
}