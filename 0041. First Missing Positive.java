class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;  

        // Step 1: Place each number in its right position (nums[i] should be i + 1)  
        for (int i = 0; i < n; i++) {  
            // While the current number is in the range and is not in the right position, swap it to the correct position  
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {  
                // Swap nums[i] with nums[nums[i] - 1]  
                int temp = nums[i];  
                nums[i] = nums[temp - 1];  
                nums[temp - 1] = temp;  
            }  
        }  

        // Step 2: Identify the first missing positive  
        for (int i = 0; i < n; i++) {  
            // The first index i where nums[i] is not i + 1  
            if (nums[i] != i + 1) {  
                return i + 1; // i + 1 is the missing positive  
            }  
        }  

        // Step 3: If all positions are filled correctly, return n + 1  
        return n + 1;  
    }  
}
