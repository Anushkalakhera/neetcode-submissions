class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int minPrice=prices[0];
        int maxPro=0;
        for(int i=0;i<n;i++){
            minPrice=Math.min(prices[i],minPrice);
            int currPro=prices[i]-minPrice;
            maxPro=Math.max(currPro,maxPro);
        }
        return maxPro;
    }
}