class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> charMap = new HashMap<>();  
        int maxLength = 0;  
        int leftPointer = 0;  

        for (int rightPointer = 0; rightPointer < s.length(); rightPointer++) {  
            char currentChar = s.charAt(rightPointer);  
 
            if (charMap.containsKey(currentChar) && charMap.get(currentChar) >= leftPointer) {  
                leftPointer = charMap.get(currentChar) + 1;  
            }  
            charMap.put(currentChar, rightPointer);   
            maxLength = Math.max(maxLength, rightPointer - leftPointer + 1);  
        }  

        return maxLength; 
    }
}
