class Solution {
    public int maxProfit(int[] prices) {
        if (prices==null||prices.length==0){
            return 0;
        }
        int maxprofit =0;
        int bestbuy=prices[0];
        for(int i=1;i<prices.length;i++){
            maxprofit=Math.max(maxprofit,prices[i]-bestbuy);
            bestbuy=Math.min(bestbuy,prices[i]);
           
        }
        return maxprofit;
    }
}