class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();  
        if (matrix.length == 0) return result;  

        int top = 0, bottom = matrix.length - 1; // The top and bottom row indices  
        int left = 0, right = matrix[0].length - 1; // The left and right column indices  

        while (top <= bottom && left <= right) {  
            // Traverse from left to right across the top row  
            for (int i = left; i <= right; i++) {  
                result.add(matrix[top][i]);  
            }  
            top++;  

            // Traverse from top to bottom down the right column  
            for (int i = top; i <= bottom; i++) {  
                result.add(matrix[i][right]);  
            }  
            right--;  

            if (top <= bottom) {  
                // Traverse from right to left across the bottom row  
                for (int i = right; i >= left; i--) {  
                    result.add(matrix[bottom][i]);  
                }  
                bottom--;  
            }  

            if (left <= right) {  
                // Traverse from bottom to top up the left column  
                for (int i = bottom; i >= top; i--) {  
                    result.add(matrix[i][left]);  
                }  
                left++;  
            }  
        }  

        return result; 
    }
}
