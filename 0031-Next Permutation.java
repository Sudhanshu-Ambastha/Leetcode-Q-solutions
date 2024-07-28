class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;  
        int i = n - 2;  
        
        // Step 1: Find the first decreasing element from the right  
        while (i >= 0 && nums[i] >= nums[i + 1]) {  
            i--;  
        }  
        
        if (i >= 0) {  
            // Step 2: Find the element just larger than nums[i] to swap with  
            int j = n - 1;  
            while (nums[j] <= nums[i]) {  
                j--;  
            }  
            swap(nums, i, j);  
        }  
        
        // Step 3: Reverse the sequence from i + 1 to the end of the array  
        reverse(nums, i + 1, n - 1);  
    }  
    
    private void swap(int[] nums, int i, int j) {  
        int temp = nums[i];  
        nums[i] = nums[j];  
        nums[j] = temp;  
    }  
    
    private void reverse(int[] nums, int start, int end) {  
        while (start < end) {  
            swap(nums, start, end);  
            start++;  
            end--;  
        }
    }
}
