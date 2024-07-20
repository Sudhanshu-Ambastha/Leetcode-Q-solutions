class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>();  
        vowels.add('a');  
        vowels.add('e');  
        vowels.add('i');  
        vowels.add('o');  
        vowels.add('u');  
        vowels.add('A');  
        vowels.add('E');  
        vowels.add('I');  
        vowels.add('O');  
        vowels.add('U');  

        char[] chars = s.toCharArray();  
        int left = 0, right = s.length() - 1;  

        while (left < right) {  
            // Move left pointer to the next vowel  
            while (left < right && !vowels.contains(chars[left])) {  
                left++;  
            }  
            // Move right pointer to the previous vowel  
            while (left < right && !vowels.contains(chars[right])) {  
                right--;  
            }  
            // Swap the vowels  
            if (left < right) {  
                char temp = chars[left];  
                chars[left] = chars[right];  
                chars[right] = temp;  
                left++;  
                right--;  
            }  
        }  

        return new String(chars);  
    }
}
