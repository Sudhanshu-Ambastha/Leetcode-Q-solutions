class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();  
        Arrays.sort(candidates);  
        backtrack(candidates, target, 0, new ArrayList<>(), results);  
        return results;  
    }  

    private void backtrack(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> results) {  
        if (target == 0) {  
            results.add(new ArrayList<>(current));  
            return;  
        }  
        for (int i = start; i < candidates.length; i++) {  
            // Skip duplicates  
            if (i > start && candidates[i] == candidates[i - 1]) continue;  
            if (candidates[i] > target) break; // No need to continue if number exceeds target  

            current.add(candidates[i]);  
            backtrack(candidates, target - candidates[i], i + 1, current, results);  
            current.remove(current.size() - 1); 
        }
    }
}
