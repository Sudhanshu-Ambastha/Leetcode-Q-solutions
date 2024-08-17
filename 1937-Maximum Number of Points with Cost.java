class Solution {
    public long maxPoints(int[][] points) {
        int m = points.length;
        int n = points[0].length;
        long[] prevRow = new long[n];
        
        // Initialize the first row
        for (int j = 0; j < n; j++) {
            prevRow[j] = points[0][j];
        }

        // Process each row
        for (int i = 1; i < m; i++) {
            long[] left = new long[n];
            long[] right = new long[n];
            long[] currRow = new long[n];

            // Fill left array
            left[0] = prevRow[0];
            for (int j = 1; j < n; j++) {
                left[j] = Math.max(left[j - 1], prevRow[j] + j);
            }

            // Fill right array
            right[n - 1] = prevRow[n - 1] - (n - 1);
            for (int j = n - 2; j >= 0; j--) {
                right[j] = Math.max(right[j + 1], prevRow[j] - j);
            }

            // Calculate current row values
            for (int j = 0; j < n; j++) {
                currRow[j] = points[i][j] + Math.max(left[j] - j, right[j] + j);
            }

            // Update previous row
            prevRow = currRow;
        }

        // Find the maximum value in the last processed row
        long maxPoints = 0;
        for (long val : prevRow) {
            maxPoints = Math.max(maxPoints, val);
        }

        return maxPoints; 
    }
}
