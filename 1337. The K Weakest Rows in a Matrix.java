class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;  
        int[][] soldiers = new int[m][2]; // Array to store the number of soldiers and the index  
        
        // Fill the soldiers array with the count of soldiers and their respective row index  
        for (int i = 0; i < m; i++) {  
            int count = 0;  
            for (int j = 0; j < mat[i].length; j++) {  
                if (mat[i][j] == 1) {  
                    count++;  
                } else {  
                    break; // Since soldiers are always on the left  
                }  
            }  
            soldiers[i][0] = count; // Number of soldiers  
            soldiers[i][1] = i;     // Row index  
        }  

        // Sort based on the number of soldiers and then by index  
        Arrays.sort(soldiers, new Comparator<int[]>() {  
            public int compare(int[] a, int[] b) {  
                if (a[0] != b[0]) {  
                    return Integer.compare(a[0], b[0]); // Compare soldier counts  
                }  
                return Integer.compare(a[1], b[1]); // If equal soldier count, compare indices  
            }  
        });  
        
        // Extract the indices of the k weakest rows  
        int[] result = new int[k];  
        for (int i = 0; i < k; i++) {  
            result[i] = soldiers[i][1];  
        }  
        
        return result;
    }
}
