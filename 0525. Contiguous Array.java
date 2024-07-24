class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();  
        map.put(0, -1); // Initialize for the case where the entire array has equal 0s and 1s  
        int maxLength = 0;  
        int count = 0; // This will act as the cumulative sum  

        for (int i = 0; i < nums.length; i++) {  
            // Treat 0 as -1 and 1 as +1  
            count += (nums[i] == 1) ? 1 : -1;  

            if (map.containsKey(count)) {  
                // Calculate the length of the subarray  
                maxLength = Math.max(maxLength, i - map.get(count));  
            } else {  
                // Store the first occurrence of this count  
                map.put(count, i);  
            }  
        }  
        
        return maxLength;
    }
}
