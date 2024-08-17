class TrieNode {  
    TrieNode[] children;  
    boolean isEndOfWord;  

    public TrieNode() {  
        children = new TrieNode[26]; // Initialize array for 26 lowercase letters  
        isEndOfWord = false; // Indicates if the node marks the end of a valid word  
    }  
}  

class Trie {  
    private TrieNode root;  

    /** Initialize your data structure here. */  
    public Trie() {  
        root = new TrieNode(); // Create the root node of the Trie  
    }  

    /** Inserts a word into the trie. */  
    public void insert(String word) {  
        TrieNode node = root;  
        for (char c : word.toCharArray()) {  
            int index = c - 'a'; // Calculate index for the character  
            if (node.children[index] == null) {  
                node.children[index] = new TrieNode(); // Create a new node if it does not exist  
            }  
            node = node.children[index]; // Move to the child node  
        }  
        node.isEndOfWord = true; // Mark the end of the word  
    }  

    /** Returns true if the word is in the trie. */  
    public boolean search(String word) {  
        TrieNode node = root;  
        for (char c : word.toCharArray()) {  
            int index = c - 'a'; // Calculate index for the character  
            if (node.children[index] == null) {  
                return false; // Not found  
            }  
            node = node.children[index]; // Move to the child node  
        }  
        return node.isEndOfWord; // Check if it's the end of a valid word  
    }  

    /** Returns true if there is a word in the trie that starts with the given prefix. */  
    public boolean startsWith(String prefix) {  
        TrieNode node = root;  
        for (char c : prefix.toCharArray()) {  
            int index = c - 'a'; // Calculate index for the character  
            if (node.children[index] == null) {  
                return false; // Not found  
            }  
            node = node.children[index]; // Move to the child node  
        }  
        return true; // Found the prefix  
    }  
}
