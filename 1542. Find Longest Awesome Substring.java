class Solution {
    public int longestAwesome(String s) {
        int maxLength = 0;  
        HashMap<Integer, Integer> map = new HashMap<>();  
        map.put(0, -1); // Handle the case where the entire substring is awesome  
        int bitmask = 0;  

        for (int i = 0; i < s.length(); i++) {  
            // Update the bitmask for the current digit  
            int digit = s.charAt(i) - '0';  
            bitmask ^= (1 << digit);  
            
            // Check if this bitmask has been seen before  
            if (map.containsKey(bitmask)) {  
                maxLength = Math.max(maxLength, i - map.get(bitmask));  
            } else {  
                // Store the first occurrence of this bitmask  
                map.put(bitmask, i);  
            }  

            // Check for bitmasks with a single digit flipped (only one odd frequency)  
            for (int j = 0; j < 10; j++) {  
                int maskWithOneOdd = bitmask ^ (1 << j);  
                if (map.containsKey(maskWithOneOdd)) {  
                    maxLength = Math.max(maxLength, i - map.get(maskWithOneOdd));  
                }  
            }  
        }  
        
        return maxLength;
    }
}
