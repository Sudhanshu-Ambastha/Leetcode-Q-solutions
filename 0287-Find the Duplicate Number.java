class Solution {
    public int findDuplicate(int[] nums) {
        // Step 1: Find the intersection point in the cycle  
        int tortoise = nums[0];  
        int hare = nums[0];  

        // Move tortoise by 1 step and hare by 2 steps  
        do {  
            tortoise = nums[tortoise]; // move by 1 step  
            hare = nums[nums[hare]];   // move by 2 steps  
        } while (tortoise != hare);  

        // Step 2: Find the entrance to the cycle  
        tortoise = nums[0];  
        
        while (tortoise != hare) {  
            tortoise = nums[tortoise]; // move by 1 step  
            hare = nums[hare];         // move by 1 step  
        }  

        // The point where they meet is the duplicate number  
        return hare;  
    }  
}
