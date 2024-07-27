class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length;  
        int n = grid[0].length;  

        // Initialize row and column counts for ones and zeros  
        int[] onesRow = new int[m];  
        int[] zerosRow = new int[m];  
        int[] onesCol = new int[n];  
        int[] zerosCol = new int[n];  

        // Calculate the number of ones and zeros in each row and column  
        for (int i = 0; i < m; i++) {  
            for (int j = 0; j < n; j++) {  
                if (grid[i][j] == 1) {  
                    onesRow[i]++;  
                    onesCol[j]++;  
                }  
            }  
            zerosRow[i] = n - onesRow[i]; // Total columns minus ones  
        }  
        for (int j = 0; j < n; j++) {  
            zerosCol[j] = m - onesCol[j]; // Total rows minus ones  
        }  

        // Create the difference matrix  
        int[][] diff = new int[m][n];  
        for (int i = 0; i < m; i++) {  
            for (int j = 0; j < n; j++) {  
                diff[i][j] = onesRow[i] + onesCol[j] - zerosRow[i] - zerosCol[j];  
            }  
        }  

        return diff; 
    }
}
