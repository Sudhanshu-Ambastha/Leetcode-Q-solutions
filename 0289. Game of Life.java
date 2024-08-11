class Solution {
    public void gameOfLife(int[][] board) {
        if (board == null || board.length == 0 || board[0].length == 0) return;  

        int m = board.length;  
        int n = board[0].length;  

        // Directions for the 8 neighbors  
        int[] directions = {-1, -1, -1, 0, -1, 1, 0, -1, 0, 1, 1, -1, 1, 0, 1, 1};  

        // Iterate through each cell  
        for (int i = 0; i < m; i++) {  
            for (int j = 0; j < n; j++) {  
                int liveNeighbors = 0;  

                // Count live neighbors  
                for (int d = 0; d < 8; d++) {  
                    int ni = i + directions[d * 2];  
                    int nj = j + directions[d * 2 + 1];  
                    if (ni >= 0 && ni < m && nj >= 0 && nj < n) {  
                        if (board[ni][nj] == 1 || board[ni][nj] == 2) {  
                            liveNeighbors++;  
                        }  
                    }  
                }  

                // Apply the rules  
                if (board[i][j] == 1) { // Live cell  
                    if (liveNeighbors < 2 || liveNeighbors > 3) {  
                        board[i][j] = 2; // Mark as dead  
                    }  
                } else { // Dead cell  
                    if (liveNeighbors == 3) {  
                        board[i][j] = 3; // Mark as live  
                    }  
                }  
            }  
        }  

        // Update the board to the next state  
        for (int i = 0; i < m; i++) {  
            for (int j = 0; j < n; j++) {  
                if (board[i][j] == 2) {  
                    board[i][j] = 0; // Dead  
                } else if (board[i][j] == 3) {  
                    board[i][j] = 1; // Live  
                }  
            }  
        }  
    }  
}  
