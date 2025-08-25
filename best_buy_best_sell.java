class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0,bestbuy=prices[0];
        for(int i=0;i<prices.length;i++){
            if(prices[i]>bestbuy){
                maxprofit=Math.max(maxprofit,prices[i]-bestbuy);
            }
            bestbuy=Math.min(prices[i],bestbuy);
        }
        return maxprofit;
    }
}
