class Solution {
    public int search(int[] nums, int target) {
        int left = 0;  
        int right = nums.length - 1;  
        
        while (left <= right) {  
            int mid = left + (right - left) / 2; // To prevent overflow  
            
            if (nums[mid] == target) {  
                return mid; // Target found, return the index  
            } else if (nums[mid] < target) {  
                left = mid + 1; // Target is in the right half  
            } else {  
                right = mid - 1; // Target is in the left half  
            }  
        }  
        
        return -1; // Target not found
    }
}
