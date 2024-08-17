class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> indexMap = new HashMap<>();  

        for (int i = 0; i < nums.length; i++) {  
            if (indexMap.containsKey(nums[i])) {  
                int previousIndex = indexMap.get(nums[i]);  
                if (Math.abs(previousIndex - i) <= k) {  
                    return true;  
                }  
            }  
            indexMap.put(nums[i], i);  
        }  

        return false;  
    }  
}
