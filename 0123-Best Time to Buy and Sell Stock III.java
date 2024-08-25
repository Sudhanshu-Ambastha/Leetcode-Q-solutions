class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {  
            return 0;  
        }  

        int n = prices.length;  
        // maxProfit1 is the maximum profit with at most 1 transaction  
        // maxProfit2 is the maximum profit with at most 2 transactions  
        
        int[] maxProfit1 = new int[n];  
        int[] maxProfit2 = new int[n];  

        // Calculate maximum profit with 1 transaction  
        int minPrice = prices[0];  
        for (int i = 1; i < n; i++) {  
            minPrice = Math.min(minPrice, prices[i]);  
            maxProfit1[i] = Math.max(maxProfit1[i - 1], prices[i] - minPrice);  
        }  

        // Calculate maximum profit with 2 transactions  
        int maxPrice = prices[n - 1];  
        for (int i = n - 2; i >= 0; i--) {  
            maxPrice = Math.max(maxPrice, prices[i]);  
            maxProfit2[i] = Math.max(maxProfit2[i + 1], maxPrice - prices[i] + maxProfit1[i]);  
        }  

        return maxProfit2[0];
    }
}
