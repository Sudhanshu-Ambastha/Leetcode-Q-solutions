class Solution {
    public boolean increasingTriplet(int[] nums) {
        // Initialize the first two elements to be the maximum possible value  
        int first = Integer.MAX_VALUE;  
        int second = Integer.MAX_VALUE;  

        // Iterate through each number in the array  
        for (int num : nums) {  
            // Update the first element if the current number is smaller  
            if (num <= first) {  
                first = num; // Update the first smallest  
            }  
            // Update the second element if we find a number larger than first but smaller than second  
            else if (num <= second) {  
                second = num; // Update the second smallest  
            }   
            // If we find a number greater than both first and second, return true  
            else {  
                return true;  
            }  
        }  

        // If no triplet found, return false  
        return false; 
    }
}
