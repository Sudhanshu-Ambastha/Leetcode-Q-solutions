class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;  
        int[] result = new int[n];  
        int maxFromRight = -1; // Initialize the greatest element to the right of the last element  

        // Traverse the array from the end to the beginning  
        for (int i = n - 1; i >= 0; i--) {  
            result[i] = maxFromRight; // Set the current index to the maxFromRight found so far  
            maxFromRight = Math.max(maxFromRight, arr[i]); // Update maxFromRight  
        }  

        return result; 
    }
}
