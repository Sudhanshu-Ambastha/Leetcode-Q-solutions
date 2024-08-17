class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;  
        int right = numbers.length - 1;  

        while (left < right) {  
            int sum = numbers[left] + numbers[right];  
            if (sum == target) {  
                return new int[] {left + 1, right + 1}; // Return 1-indexed result  
            } else if (sum < target) {  
                left++; // Move the left pointer to the right  
            } else {  
                right--; // Move the right pointer to the left  
            }  
        }  
        
        // The problem guarantees that there is exactly one solution, so we don't need a return here  
        return new int[0];
    }
}
