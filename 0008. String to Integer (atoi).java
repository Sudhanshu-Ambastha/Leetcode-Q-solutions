class Solution {
    public int myAtoi(String s) {
        int i = 0; // index for traversing the string  
        int n = s.length();  
        
        // Step 1: Ignore leading whitespace  
        while (i < n && s.charAt(i) == ' ') {  
            i++;  
        }  
        
        // Step 2: Determine the sign  
        int sign = 1; // Default sign is positive  
        if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {  
            if (s.charAt(i) == '-') {  
                sign = -1; // Set sign to negative  
            }  
            i++; // Move to the next character  
        }  

        // Step 3: Read the integer and ignore leading zeros  
        long result = 0; // Use long to handle overflow  
        while (i < n && Character.isDigit(s.charAt(i))) {  
            result = result * 10 + (s.charAt(i) - '0');  

            // Step 4: Check for overflow  
            if (result > Integer.MAX_VALUE) {  
                break;  
            }  
            i++;  
        }  

        // Apply sign to the result  
        result *= sign;  

        // Step 5: Clamp the result within the 32-bit signed integer range  
        if (result < Integer.MIN_VALUE) {  
            return Integer.MIN_VALUE;  
        }  
        if (result > Integer.MAX_VALUE) {  
            return Integer.MAX_VALUE;  
        }  
        
        return (int)result;
    }
}
