class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 1) {
            return n;
        }

        int i = 0; 
        for (int j = 1; j < n; j++) {
            if (nums[i] != nums[j]) {
                nums[i + 1] = nums[j];
                i++;
            }
        }

        return i + 1;
    }
}
