class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int k = 0; k < nums.length; k++) {
            int i = k + 1;
            int j = nums.length - 1;
            int target = -1 * nums[k];

            while (i < j) {
                int sum = nums[i] + nums[j];
                if (sum < target) {
                    i++;
                } else if (sum > target) {
                    j--;
                } else if (sum == target) {
                    result.add(Arrays.asList(nums[k], nums[i], nums[j]));
                    i++;
                    j--;

                    while (i < j && nums[i] == nums[i - 1]) {
                        i++;
                    }
                    while (i < j && nums[j] == nums[j + 1]) {
                        j--;
                    }
                }
            }

            while (k + 1 < nums.length && nums[k] == nums[k + 1]) {
                k++;
            }
        }

        return result;
    }
}
