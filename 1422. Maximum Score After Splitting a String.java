class Solution {
    public int maxScore(String s) {
        int n = s.length();  
        int[] leftZeros = new int[n];  
        int[] rightOnes = new int[n];  

        // Count the number of zeros in the left segments  
        for (int i = 0; i < n; i++) {  
            if (i > 0) {  
                leftZeros[i] = leftZeros[i - 1];  
            }  
            if (s.charAt(i) == '0') {  
                leftZeros[i]++;  
            }  
        }  

        // Count the number of ones in the right segments  
        for (int i = n - 1; i >= 0; i--) {  
            if (i < n - 1) {  
                rightOnes[i] = rightOnes[i + 1];  
            }  
            if (s.charAt(i) == '1') {  
                rightOnes[i]++;  
            }  
        }  

        int maxScore = 0;  

        // Calculate max score by splitting the string  
        for (int i = 0; i < n - 1; i++) {  
            maxScore = Math.max(maxScore, leftZeros[i] + rightOnes[i + 1]);  
        }  

        return maxScore;  
    }
}
