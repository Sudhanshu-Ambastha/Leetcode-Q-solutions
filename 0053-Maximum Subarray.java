class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int sumSoFar = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (sumSoFar < 0) {
                sumSoFar = nums[i]; 
            } else {
                sumSoFar += nums[i];
            }

            if (sumSoFar > maxSum) {
                maxSum = sumSoFar;
            }
        }

        return maxSum;
    }
}
