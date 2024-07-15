class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return 0;
        }
        if (nums[0] > nums[1]) {
            return 0;
        }
        if (nums[n - 1] > nums[n - 2]) {
            return n - 1;
        }
        for (int i = 1; i < n - 1; i++) {
            int current = nums[i];
            int left = nums[i - 1];
            int right = nums[i + 1]; 

            if (current > left && current > right) {
                return i;
            }
        }
        return -1;
    }
}
