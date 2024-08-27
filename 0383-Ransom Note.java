class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26]; // Initialize an array to store character frequencies

        // Increment count for each character in magazine
        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }

        // Decrement count for each character in ransomNote
        for (char c : ransomNote.toCharArray()) {
            if (count[c - 'a'] == 0) {
                return false; // Not enough characters in magazine
            }
            count[c - 'a']--;
        }

        return true;
    }
}
