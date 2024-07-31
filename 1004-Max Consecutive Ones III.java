class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;  
        int right = 0;  
        int maxLength = 0;  
        int zeroCount = 0;  

        while (right < nums.length) {  
            // Expand the window by moving right pointer  
            if (nums[right] == 0) {  
                zeroCount++;  
            }  

            // While the number of zeros exceeds k, move the left pointer right  
            while (zeroCount > k) {  
                if (nums[left] == 0) {  
                    zeroCount--;  
                }  
                left++;  
            }  

            // Calculate the maximum length of the window  
            maxLength = Math.max(maxLength, right - left + 1);  
            right++;  
        }  

        return maxLength;
    }
}
