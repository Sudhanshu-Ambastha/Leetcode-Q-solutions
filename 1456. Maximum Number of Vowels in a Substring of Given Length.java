class Solution {
    public int maxVowels(String s, int k) {
        int maxVowelCount = 0;  
        int currentVowelCount = 0;  
        int n = s.length();  
        
        // Define a set of vowels for easy checking  
        String vowels = "aeiou";  
        
        // Count vowels in the first 'k' characters  
        for (int i = 0; i < k; i++) {  
            if (vowels.indexOf(s.charAt(i)) != -1) {  
                currentVowelCount++;  
            }  
        }  
        maxVowelCount = currentVowelCount;  

        // Slide the window over the rest of the string  
        for (int i = k; i < n; i++) {  
            // Remove the character going out of the window  
            if (vowels.indexOf(s.charAt(i - k)) != -1) {  
                currentVowelCount--;  
            }  
            // Add the new character coming into the window  
            if (vowels.indexOf(s.charAt(i)) != -1) {  
                currentVowelCount++;  
            }  
            // Update the maximum vowel count  
            maxVowelCount = Math.max(maxVowelCount, currentVowelCount);  
        }  

        return maxVowelCount;
    }
}
