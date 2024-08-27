class Solution {
    public boolean canJump(int[] nums) {
        int maxReach = 0;  
        for (int i = 0; i < nums.length; i++) {  
            if (i > maxReach) {  
                return false; // If we can't reach this index  
            }  
            maxReach = Math.max(maxReach, i + nums[i]); // Update the maximum reachable index  
            if (maxReach >= nums.length - 1) {  
                return true; // We can reach the last index  
            }  
        }  
        return false;
    }
}
