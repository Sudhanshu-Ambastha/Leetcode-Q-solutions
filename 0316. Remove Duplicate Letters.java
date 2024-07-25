class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastOccurrence = new int[26];  
        for (int i = 0; i < s.length(); i++) {  
            lastOccurrence[s.charAt(i) - 'a'] = i;  
        }  

        boolean[] inStack = new boolean[26]; // To track characters in the stack  
        Stack<Character> stack = new Stack<>();  

        for (int i = 0; i < s.length(); i++) {  
            char current = s.charAt(i);  

            // If the character is already in the stack, skip it  
            if (inStack[current - 'a']) continue;  

            // Ensure letters in the stack are in lexicographical order  
            while (!stack.isEmpty() && stack.peek() > current && lastOccurrence[stack.peek() - 'a'] > i) {  
                // Pop from stack if the top character is greater than current and it will appear later  
                inStack[stack.pop() - 'a'] = false;  
            }  

            // Push the current character onto the stack and mark it as in the stack  
            stack.push(current);  
            inStack[current - 'a'] = true;  
        }  

        // Build the result from the stack  
        StringBuilder result = new StringBuilder();  
        while (!stack.isEmpty()) {  
            result.append(stack.pop());  
        }  

        // Since we built the result in reverse order, we need to reverse it  
        return result.reverse().toString();
    }
}
