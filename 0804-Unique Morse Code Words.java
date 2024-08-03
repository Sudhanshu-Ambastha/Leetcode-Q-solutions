class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        // Define the Morse code for each letter a-z  
        String[] morseCode = {".-", "-...", "-.-.", "-..", ".", "..-.",  
                              "--.", "....", "..", ".---", "-.-", ".-..",   
                              "--", "-.", "---", ".--.", "--.-", ".-.",   
                              "...", "-", "..-", "...-", ".--", "-..-",   
                              "-.--", "--.."};  

        // Use a HashSet to store unique Morse code representations  
        HashSet<String> uniqueTransformations = new HashSet<>();  

        // Iterate through each word in the array  
        for (String word : words) {  
            StringBuilder morseWord = new StringBuilder();  
            
            // Convert each letter of the word to Morse code  
            for (char c : word.toCharArray()) {  
                int index = c - 'a'; // Get the index of the letter  
                morseWord.append(morseCode[index]); // Append the Morse code  
            }  
            
            // Add the converted Morse code representation to the HashSet  
            uniqueTransformations.add(morseWord.toString());  
        }  

        // The size of the HashSet gives the number of unique transformations  
        return uniqueTransformations.size();  
    }  
}  
