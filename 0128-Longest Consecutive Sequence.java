class Solution {
    public int longestConsecutive(int[] nums) {
        // Use a HashSet to store the numbers for O(1) access  
        HashSet<Integer> numSet = new HashSet<>();  
        for (int num : nums) {  
            numSet.add(num);  
        }  

        int longestStreak = 0;  

        // Iterate through the numbers  
        for (int num : nums) {  
            // Only check for the start of a sequence  
            if (!numSet.contains(num - 1)) {  
                int currentNum = num;  
                int currentStreak = 1;  

                // Count consecutive numbers  
                while (numSet.contains(currentNum + 1)) {  
                    currentNum++;  
                    currentStreak++;  
                }  
                
                // Update the longest streak  
                longestStreak = Math.max(longestStreak, currentStreak);  
            }  
        }  

        return longestStreak;
    }
}
