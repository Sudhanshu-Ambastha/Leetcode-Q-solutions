class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;  
        int rows = grid.length;  
        int cols = grid[0].length;  

        for (int i = 0; i < rows; i++) {  
            for (int j = 0; j < cols; j++) {  
                if (grid[i][j] == 1) { // If it's land  
                    perimeter += 4; // Start with 4 sides  
                    // Check the cell above  
                    if (i > 0 && grid[i - 1][j] == 1) {  
                        perimeter--; // Subtract 1 for the common edge  
                    }  
                    // Check the cell below  
                    if (i < rows - 1 && grid[i + 1][j] == 1) {  
                        perimeter--; // Subtract 1 for the common edge  
                    }  
                    // Check the cell to the left  
                    if (j > 0 && grid[i][j - 1] == 1) {  
                        perimeter--; // Subtract 1 for the common edge  
                    }  
                    // Check the cell to the right  
                    if (j < cols - 1 && grid[i][j + 1] == 1) {  
                        perimeter--; // Subtract 1 for the common edge  
                    }  
                }  
            }  
        }  
        
        return perimeter;  
    }  
}  
