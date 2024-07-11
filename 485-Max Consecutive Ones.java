class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutiveOnes = 0;
        int currentConsecutiveOnes = 0;
        
        for (int num : nums) {
            if (num == 1) {
                currentConsecutiveOnes++;
                maxConsecutiveOnes = Math.max(maxConsecutiveOnes, currentConsecutiveOnes);
            } else {
                currentConsecutiveOnes = 0;
            }
        }
        
        return maxConsecutiveOnes;
    }
}
