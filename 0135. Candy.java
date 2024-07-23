class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;  
        if (n == 0) return 0;  

        int[] candies = new int[n];  
        // Step 1: Give each child 1 candy initially  
        for (int i = 0; i < n; i++) {  
            candies[i] = 1;  
        }  

        // Step 2: Left to right pass  
        for (int i = 1; i < n; i++) {  
            if (ratings[i] > ratings[i - 1]) {  
                candies[i] = candies[i - 1] + 1;  
            }  
        }  

        // Step 3: Right to left pass  
        for (int i = n - 2; i >= 0; i--) {  
            if (ratings[i] > ratings[i + 1]) {  
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);  
            }  
        }  

        // Step 4: Calculate the total candies  
        int totalCandies = 0;  
        for (int candy : candies) {  
            totalCandies += candy;  
        }  

        return totalCandies;
    }
}
