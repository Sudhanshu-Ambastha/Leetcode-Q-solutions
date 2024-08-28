class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;  
        int length = flowerbed.length;  

        for (int i = 0; i < length; i++) {  
            // Check if the current plot is empty and the adjacent plots are also empty  
            if (flowerbed[i] == 0) {  
                boolean emptyLeft = (i == 0 || flowerbed[i - 1] == 0);  
                boolean emptyRight = (i == length - 1 || flowerbed[i + 1] == 0);  
                
                if (emptyLeft && emptyRight) {  
                    // Place a flower here  
                    flowerbed[i] = 1;  
                    count++;  
                }  
            }  
            // If we already put enough flowers, we can return true  
            if (count >= n) {  
                return true;  
            }  
        }  

        // If we exit the loop, check if we managed to plant enough flowers  
        return count >= n;  
    }  
}  
