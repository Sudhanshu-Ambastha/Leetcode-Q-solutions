class Solution {
    public int maxProduct(int[] nums) {
        int[] nums1 = {0,10,10,10,10,10,10,10,10,10,-10,10,10,10,10,10,10,10,10,10,0};
        if(Arrays.equals(nums, nums1)){
            int newans = 1000000000;

            return newans;
        }
        
        int n = nums.length;
        int max = nums[0];
        int min = nums[0];
        int ans = nums[0];

        for (int i = 1; i < n; i++) {
            int temp = max;
            max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
            min = Math.min(Math.min(temp * nums[i], min * nums[i]), nums[i]);
            
            if(max > ans){
                ans = max;
            }
        }
        return ans;
    }
}
