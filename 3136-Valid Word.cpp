class Solution {
public:
    bool isVowel(char c) {
        c = tolower(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    bool checkValid(string word) {
        bool has_vowel = false;
        bool has_consonant = false;

        for(char c : word) {
            if (!isalnum(c)) {
                return false; 
            }

            if (isalpha(c)) {
                if (isVowel(c)) {
                    has_vowel = true;
                } else {
                    has_consonant = true;
                }
            }
        }
        
        return has_vowel && has_consonant;
    }
    
    bool isValid(string word) {
        if (word.length() < 3) {
            return false;
        }
        return checkValid(word);
    }
};
