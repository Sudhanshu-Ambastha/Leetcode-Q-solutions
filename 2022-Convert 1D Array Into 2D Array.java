class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != m * n) {
            return new int[0][0];
        }
        
        int[][] arr2d = new int[m][n];
        
        for (int idx = 0; idx < original.length; idx++) {
            int i = idx / n;
            int j = idx % n;
            arr2d[i][j] = original[idx];
        }
        
        return arr2d;
    }
}
