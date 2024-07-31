class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> charCountMap = new HashMap<>();  

        // Count the occurrences of each character  
        for (char c : s.toCharArray()) {  
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);  
        }  

        int length = 0;  
        boolean hasOddCount = false;  

        // Calculate the length of the longest palindrome  
        for (int count : charCountMap.values()) {  
            if (count % 2 == 0) {  
                length += count; // If the count is even, use all characters  
            } else {  
                length += count - 1; // If the count is odd, use the largest even number  
                hasOddCount = true; // We found at least one character with an odd count  
            }  
        }  

        // If there was any character with an odd count, we can place one odd character in the middle  
        if (hasOddCount) {  
            length += 1;  
        }  

        return length;
    }
}
