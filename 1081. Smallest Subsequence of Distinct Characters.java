class Solution {
    public String smallestSubsequence(String s) {
        int[] lastOccurrence = new int[26];  
        for (int i = 0; i < s.length(); i++) {  
            lastOccurrence[s.charAt(i) - 'a'] = i;  
        }  

        boolean[] inResult = new boolean[26]; // Track if character is already in the result  
        Stack<Character> stack = new Stack<>(); // To build the resultant subsequence  

        for (int i = 0; i < s.length(); i++) {  
            char currentChar = s.charAt(i);  

            // If the character is already in the result, continue to the next character  
            if (inResult[currentChar - 'a']) {  
                continue;  
            }  

            // While the stack is not empty and the current character is smaller than  
            // the character at the top of the stack and the top character will appear later  
            while (!stack.isEmpty() && currentChar < stack.peek() &&   
                   i < lastOccurrence[stack.peek() - 'a']) {  
                inResult[stack.pop() - 'a'] = false;  
            }  

            stack.push(currentChar); // Add the current character to the stack  
            inResult[currentChar - 'a'] = true; // Mark this character as added  
        }  

        // Build the result from the characters in the stack  
        StringBuilder result = new StringBuilder();  
        for (char c : stack) {  
            result.append(c);  
        }  

        return result.toString();
    }
}
