class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMostK(nums, k) - atMostK(nums, k - 1);  
    }  
    
    private int atMostK(int[] nums, int k) {  
        if (k == 0) return 0;  
        
        int left = 0, count = 0;  
        HashMap<Integer, Integer> map = new HashMap<>();  
        
        for (int right = 0; right < nums.length; right++) {  
            // Include the right element in the window  
            if (map.getOrDefault(nums[right], 0) == 0) {  
                k--;  
            }  
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);  
            
            // Shrink the window until we have at most k different integers  
            while (k < 0) {  
                map.put(nums[left], map.get(nums[left]) - 1);  
                if (map.get(nums[left]) == 0) {  
                    k++;  
                }  
                left++;  
            }  
            
            // Count the number of subarrays ending at the right pointer  
            count += right - left + 1;  
        }  
        
        return count;  
    }
}
