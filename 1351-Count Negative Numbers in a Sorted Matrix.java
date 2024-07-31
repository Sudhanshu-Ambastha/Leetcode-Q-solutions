class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length;  
        int n = grid[0].length;  
        int count = 0;  
        
        int row = 0; // Start from the first row  
        int col = n - 1; // Start from the last column  
        
        while (row < m && col >= 0) {  
            if (grid[row][col] < 0) {  
                // If we find a negative number, all numbers below it in the current column are also negative  
                count += (m - row); // Count all remaining elements in this column  
                col--; // Move left to the next column  
            } else {  
                row++; // Move down if the current number is not negative  
            }  
        }  
        
        return count;  
    }
}
