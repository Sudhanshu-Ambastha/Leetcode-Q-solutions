class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;  
        Map<String, Integer> rowCount = new HashMap<>();  
        
        // Count occurrences of each row in the grid  
        for (int i = 0; i < n; i++) {  
            StringBuilder rowKey = new StringBuilder();  
            for (int j = 0; j < n; j++) {  
                rowKey.append(grid[i][j]).append(",");  
            }  
            rowCount.put(rowKey.toString(), rowCount.getOrDefault(rowKey.toString(), 0) + 1);  
        }  

        int equalPairsCount = 0;  
        
        // Compare columns with the row counts  
        for (int j = 0; j < n; j++) {  
            StringBuilder colKey = new StringBuilder();  
            for (int i = 0; i < n; i++) {  
                colKey.append(grid[i][j]).append(",");  
            }  
            // If the column is found in the row count map, increment the count  
            equalPairsCount += rowCount.getOrDefault(colKey.toString(), 0);  
        }  

        return equalPairsCount;
    }
}
