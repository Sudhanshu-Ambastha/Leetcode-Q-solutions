class Solution {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        Map<Character, Integer> letterCount = new HashMap<>();  
        for (char letter : letters) {  
            letterCount.put(letter, letterCount.getOrDefault(letter, 0) + 1);  
        }  

        // Start backtracking to find the maximum score  
        return backtrack(words, 0, letterCount, score);  
    }  

    private int backtrack(String[] words, int index, Map<Character, Integer> letterCount, int[] score) {  
        // Base case: if we've considered all words  
        if (index == words.length) {  
            return 0;  
        }  

        // Calculate the maximum score without using the current word  
        int maxScoreWithoutCurrent = backtrack(words, index + 1, letterCount, score);  

        // Calculate the score for the current word  
        String currentWord = words[index];  
        int currentWordScore = 0;  
        Map<Character, Integer> tempCount = new HashMap<>(letterCount);  
        boolean canFormWord = true;  

        // Calculate the score of the current word and check if it can be formed  
        for (char ch : currentWord.toCharArray()) {  
            currentWordScore += score[ch - 'a'];  
            // Decrease the count for the letter in the temp count  
            tempCount.put(ch, tempCount.getOrDefault(ch, 0) - 1);  
            // If the letter count goes below zero, we can't form this word  
            if (tempCount.get(ch) < 0) {  
                canFormWord = false;  
                break;  
            }  
        }  

        // If we can form the current word, we consider it in the score calculation  
        int maxScoreWithCurrent = 0;  
        if (canFormWord) {  
            maxScoreWithCurrent = currentWordScore + backtrack(words, index + 1, tempCount, score);  
        }  

        // Return the maximum of using or not using the current word  
        return Math.max(maxScoreWithoutCurrent, maxScoreWithCurrent);  
    }  
}
