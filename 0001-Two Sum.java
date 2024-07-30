class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();  
        int n = nums.length;  
        for (int i = 0; i < n; i++) {  
            int num2 = target - nums[i];  
            if (map.containsKey(num2)) {  
                return new int[] { map.get(num2), i };  
            }  
            map.put(nums[i], i);  
        }   
        return new int[0]; 
    }
}
