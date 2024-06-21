class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int distinctCount = 0;
        int lastDistinct = Integer.MIN_VALUE;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] != lastDistinct) {
                distinctCount++;
                lastDistinct = nums[i];
            }
            if (distinctCount == 3) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }
}
