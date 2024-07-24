class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";  

        // Frequency map for characters in t  
        Map<Character, Integer> tFrequency = new HashMap<>();  
        for (char c : t.toCharArray()) {  
            tFrequency.put(c, tFrequency.getOrDefault(c, 0) + 1);  
        }  

        int left = 0, right = 0, required = tFrequency.size();  
        int formed = 0;  
        Map<Character, Integer> windowCounts = new HashMap<>();  
        int[] ans = {-1, 0, 0}; // Length of the substring, left, right pointers  

        while (right < s.length()) {  
            char c = s.charAt(right);  
            windowCounts.put(c, windowCounts.getOrDefault(c, 0) + 1);  
            
            // Check if the current character is part of t and if we have enough  
            if (tFrequency.containsKey(c) && windowCounts.get(c).intValue() == tFrequency.get(c).intValue()) {  
                formed++;  
            }  

            // Try to contract the window if all required characters are in the window  
            while (left <= right && formed == required) {  
                c = s.charAt(left);  
                
                // Save the smallest window and update pointers  
                if (ans[0] == -1 || right - left + 1 < ans[0]) {  
                    ans[0] = right - left + 1;  
                    ans[1] = left;  
                    ans[2] = right;  
                }  

                // Remove the leftmost character from the window  
                windowCounts.put(c, windowCounts.get(c) - 1);  
                if (tFrequency.containsKey(c) && windowCounts.get(c).intValue() < tFrequency.get(c).intValue()) {  
                    formed--;  
                }  
                left++;  
            }  
            right++;  
        }  

        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1); 
    }
}
