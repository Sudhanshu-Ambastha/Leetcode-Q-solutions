class Solution {
    public int jump(int[] nums) {
        int n = nums.length;  
        if (n <= 1) return 0;  

        int jumps = 0;  
        int currentEnd = 0;  
        int farthest = 0;  

        for (int i = 0; i < n - 1; i++) {  
            // Update the farthest we can reach from the current position  
            farthest = Math.max(farthest, i + nums[i]);  

            // If we have reached the end of the current jump range  
            if (i == currentEnd) {  
                jumps++;  
                currentEnd = farthest; // Update the end to the farthest we can reach  

                // If we can already reach or exceed the last index, break  
                if (currentEnd >= n - 1) break;  
            }  
        }  

        return jumps; 
    }
}
