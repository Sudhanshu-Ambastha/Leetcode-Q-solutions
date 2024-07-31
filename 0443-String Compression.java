class Solution {
    public int compress(char[] chars) {
        int writeIndex = 0; // Index to write the compressed characters  
        int readIndex = 0;  // Index to read the characters  
        
        while (readIndex < chars.length) {  
            char currentChar = chars[readIndex];  
            int count = 0;  

            // Count the number of occurrences of the current character  
            while (readIndex < chars.length && chars[readIndex] == currentChar) {  
                readIndex++;  
                count++;  
            }  

            // Write the current character to the compressed array  
            chars[writeIndex++] = currentChar;  

            // If count is more than 1, write the count as well  
            if (count > 1) {  
                char[] countChars = String.valueOf(count).toCharArray();  
                for (char c : countChars) {  
                    chars[writeIndex++] = c;  
                }  
            }  
        }  

        return writeIndex;
    }
}
