class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {  
            return 0;  
        }  

        int n = prices.length;  
        int[] sell = new int[n]; 
        int[] buy = new int[n];  
        buy[0] = -prices[0]; 
        sell[0] = 0;        

        for (int i = 1; i < n; i++) {  
            sell[i] = Math.max(sell[i - 1], buy[i - 1] + prices[i]);  

            if (i - 2 >= 0) {  
                buy[i] = Math.max(buy[i - 1], sell[i - 2] - prices[i]);  
            } else {  
                buy[i] = Math.max(buy[i - 1], -prices[i]);  
            }  
        }  
  
        return sell[n - 1];  
    }  

    public static void main(String[] args) {  
        Solution solution = new Solution();  
         
        int[] prices1 = {1, 2, 3, 0, 2};  
        System.out.println(solution.maxProfit(prices1));
        
        int[] prices2 = {1};  
        System.out.println(solution.maxProfit(prices2)); 
    }  
}  
