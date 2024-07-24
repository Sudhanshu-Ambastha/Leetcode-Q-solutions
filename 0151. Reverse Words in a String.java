class Solution {
    public String reverseWords(String s) {
        // Trim the string to remove leading and trailing spaces  
        s = s.trim();  
        
        // Split the string by one or more spaces using regex  
        String[] words = s.split("\\s+");  
        
        // Use StringBuilder to efficiently create the result  
        StringBuilder reversed = new StringBuilder();  
        
        // Loop through the words in reverse order  
        for (int i = words.length - 1; i >= 0; i--) {  
            reversed.append(words[i]);  
            // Append a space if it is not the last word  
            if (i != 0) {  
                reversed.append(" ");  
            }  
        }  
        
        return reversed.toString();
    }
}
