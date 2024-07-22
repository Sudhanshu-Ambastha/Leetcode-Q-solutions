class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();  
        int len2 = s2.length();  

        if (len1 > len2) {  
            return false;  
        }  
 
        HashMap<Character, Integer> s1Count = new HashMap<>();  
        for (char c : s1.toCharArray()) {  
            s1Count.put(c, s1Count.getOrDefault(c, 0) + 1);  
        }  

        HashMap<Character, Integer> s2Count = new HashMap<>();  
        for (int i = 0; i < len2; i++) {  
            s2Count.put(s2.charAt(i), s2Count.getOrDefault(s2.charAt(i), 0) + 1);  

            if (i >= len1) {  
                char leftChar = s2.charAt(i - len1);  
                if (s2Count.get(leftChar) == 1) {  
                    s2Count.remove(leftChar);  
                } else {  
                    s2Count.put(leftChar, s2Count.get(leftChar) - 1);  
                }  
            }  
            
            if (s1Count.equals(s2Count)) {  
                return true;  
            }  
        }  

        return false;  
    }  

}
