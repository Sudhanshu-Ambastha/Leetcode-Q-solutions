class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstOccurrence = findFirstOccurrence(nums, target);  
        
        if (firstOccurrence == -1) {  
            return new int[]{-1, -1};  
        }  
        
        int lastOccurrence = findLastOccurrence(nums, target);  
        
        return new int[]{firstOccurrence, lastOccurrence};  
    }  
    
    private int findFirstOccurrence(int[] nums, int target) {  
        int left = 0, right = nums.length - 1;  
        
        while (left <= right) {  
            int mid = left + (right - left) / 2;  
            
            if (nums[mid] < target) {  
                left = mid + 1;  
            } else {  
                right = mid - 1;  
            }  
        }  
        
        if (left < nums.length && nums[left] == target) {  
            return left;  
        }  
        
        return -1;  
    }  
    
    private int findLastOccurrence(int[] nums, int target) {  
        int left = 0, right = nums.length - 1;  
        
        while (left <= right) {  
            int mid = left + (right - left) / 2;  
            
            if (nums[mid] <= target) {  
                left = mid + 1;  
            } else {  
                right = mid - 1;  
            }  
        }  
        
        return right;  
    }  
}
