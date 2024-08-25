class Solution {
    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || word == null || word.length() == 0) {  
            return false;  
        }  

        int rows = board.length;  
        int cols = board[0].length;  

        for (int i = 0; i < rows; i++) {  
            for (int j = 0; j < cols; j++) {  
                if (dfs(board, word, i, j, 0)) {  
                    return true;  
                }  
            }  
        }  

        return false;  
    }  

    private boolean dfs(char[][] board, String word, int i, int j, int index) {  
        if (index == word.length()) {  
            return true; // Found the word  
        }  

        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(index)) {  
            return false; // Out of bounds or char does not match  
        }  

        char temp = board[i][j]; // Save the current cell's value  
        board[i][j] = '#'; // Mark the cell as visited  

        // Explore all 4 directions: up, down, left, right  
        boolean found = dfs(board, word, i + 1, j, index + 1) ||  
                        dfs(board, word, i - 1, j, index + 1) ||  
                        dfs(board, word, i, j + 1, index + 1) ||  
                        dfs(board, word, i, j - 1, index + 1);  

        board[i][j] = temp; // Restore the cell's value  
        return found;  
    }
}
