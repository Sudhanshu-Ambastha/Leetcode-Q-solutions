class Solution {
    public String countAndSay(int n) {
        // Base case  
        if (n == 1) return "1";  

        // Start the sequence with the first term  
        String result = "1";  

        // Generate up to the nth term  
        for (int i = 2; i <= n; i++) {  
            result = getNextTerm(result);  
        }  
        return result;  
    }  

    // Helper method to generate the next term in the sequence  
    private String getNextTerm(String term) {  
        StringBuilder nextTerm = new StringBuilder();  
        int count = 1;  

        // Loop through the current term  
        for (int i = 1; i < term.length(); i++) {  
            // If the current character is the same as the previous one, increment the count  
            if (term.charAt(i) == term.charAt(i - 1)) {  
                count++;  
            } else {  
                // Append the count and the character to the next term  
                nextTerm.append(count).append(term.charAt(i - 1));  
                count = 1; // Reset count for the new character  
            }  
        }  
        // Append the last counted character  
        nextTerm.append(count).append(term.charAt(term.length() - 1));  

        return nextTerm.toString();  
    }  
}
