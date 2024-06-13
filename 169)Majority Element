class Solution {
    public int majorityElement(int[] nums) {
       int majorityElement = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                majorityElement = nums[i];
                count = 1;
            } else if (nums[i] == majorityElement) {
                count++;
            } else {
                count--;
            }
        }

        return majorityElement;
    }
}
