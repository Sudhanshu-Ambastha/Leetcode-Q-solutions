class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");  
        if (pattern.length() != words.length) {  
            return false; // The number of patterns must match the number of words  
        }  

        Map<Character, String> map = new HashMap<>();  
        Map<String, Character> reverseMap = new HashMap<>();  

        for (int i = 0; i < pattern.length(); i++) {  
            char pChar = pattern.charAt(i);  
            String word = words[i];  

            // Check if there is a mapping for the pattern character  
            if (!map.containsKey(pChar)) {  
                map.put(pChar, word); // Create a new mapping  
            } else if (!map.get(pChar).equals(word)) {  
                return false; // If there's already a mapping, it must match the current word  
            }  

            // Check if there is a mapping for the word  
            if (!reverseMap.containsKey(word)) {  
                reverseMap.put(word, pChar); // Create a reverse mapping  
            } else if (reverseMap.get(word) != pChar) {  
                return false; // If there's already a mapping, it must match the current pattern character  
            }  
        }  

        return true;
    }
}
