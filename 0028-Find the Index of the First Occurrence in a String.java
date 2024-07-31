class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {  
            return 0;  
        }  
        
        // Use the indexOf method to find the first occurrence of needle in haystack  
        return haystack.indexOf(needle);
    }
}
