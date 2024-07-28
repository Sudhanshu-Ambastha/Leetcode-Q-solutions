class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();  
        backtrack(results, new ArrayList<>(), candidates, target, 0);  
        return results;  
    }  

    private void backtrack(List<List<Integer>> results, List<Integer> combination, int[] candidates,   
                           int target, int start) {  
        // Base case: when the target is reached  
        if (target == 0) {  
            results.add(new ArrayList<>(combination));  
            return;  
        }  
        // If the target becomes negative, there's no point in continuing  
        if (target < 0) {  
            return;  
        }  

        for (int i = start; i < candidates.length; i++) {  
            // Include the candidate number in the combination  
            combination.add(candidates[i]);  
            // Recurse with the updated target and same index to allow duplicate use  
            backtrack(results, combination, candidates, target - candidates[i], i);  
            // Backtrack: remove the last candidate added  
            combination.remove(combination.size() - 1);
        }
    }
}
