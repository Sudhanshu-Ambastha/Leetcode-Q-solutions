class Solution {
    public String reverseWords(String s) {
        StringBuilder reversedString = new StringBuilder();  
        String[] words = s.split(" ");  
        
        for (String word : words) {  
            StringBuilder reversedWord = new StringBuilder(word);  
            reversedString.append(reversedWord.reverse().toString()).append(" ");  
        }  
         
        return reversedString.toString().trim();
    }
}
