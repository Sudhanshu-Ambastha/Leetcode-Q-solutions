class Solution {
    public void setZeroes(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {  
            return;  
        }  

        int m = matrix.length;  
        int n = matrix[0].length;  
        boolean firstRowZero = false;  
        boolean firstColumnZero = false;  

        // Check if the first row needs to be zeroed  
        for (int j = 0; j < n; j++) {  
            if (matrix[0][j] == 0) {  
                firstRowZero = true;  
                break;  
            }  
        }  

        // Check if the first column needs to be zeroed  
        for (int i = 0; i < m; i++) {  
            if (matrix[i][0] == 0) {  
                firstColumnZero = true;  
                break;  
            }  
        }  

        // Use the first row and first column to mark zeroes  
        for (int i = 1; i < m; i++) {  
            for (int j = 1; j < n; j++) {  
                if (matrix[i][j] == 0) {  
                    matrix[i][0] = 0; // Mark the first column  
                    matrix[0][j] = 0; // Mark the first row  
                }  
            }  
        }  

        // Zero out cells based on marks in the first row and first column  
        for (int i = 1; i < m; i++) {  
            for (int j = 1; j < n; j++) {  
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {  
                    matrix[i][j] = 0;  
                }  
            }  
        }  

        // Zero out the first row if needed  
        if (firstRowZero) {  
            for (int j = 0; j < n; j++) {  
                matrix[0][j] = 0;  
            }  
        }  

        // Zero out the first column if needed  
        if (firstColumnZero) {  
            for (int i = 0; i < m; i++) {  
                matrix[i][0] = 0;  
            }  
        }  
    }  
}  
