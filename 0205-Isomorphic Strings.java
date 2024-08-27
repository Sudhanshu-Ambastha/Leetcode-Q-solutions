class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {  
            return false;  
        }  
        
        HashMap<Character, Character> mapST = new HashMap<>();  
        HashMap<Character, Character> mapTS = new HashMap<>();  
        
        for (int i = 0; i < s.length(); i++) {  
            char charS = s.charAt(i);  
            char charT = t.charAt(i);  
            
            // Check mapping from s to t  
            if (mapST.containsKey(charS)) {  
                if (mapST.get(charS) != charT) {  
                    return false; // Different mapping  
                }  
            } else {  
                mapST.put(charS, charT); // Create a new mapping  
            }  
            
            // Check mapping from t to s  
            if (mapTS.containsKey(charT)) {  
                if (mapTS.get(charT) != charS) {  
                    return false; // Different mapping  
                }  
            } else {  
                mapTS.put(charT, charS); // Create a new mapping  
            }  
        }  
        
        return true; 
    }
}
