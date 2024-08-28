class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();  
        backtrack(result, new ArrayList<>(), n, k, 1);  
        return result;  
    }  
    
    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int n, int k, int start) {  
        // If the temporary list has k elements, we found a valid combination  
        if (tempList.size() == k) {  
            result.add(new ArrayList<>(tempList));  
            return;  
        }  
        
        // Loop through possible numbers to create combinations  
        for (int i = start; i <= n; i++) {  
            tempList.add(i); // Add number to the current combination  
            backtrack(result, tempList, n, k, i + 1); // Move on to the next elements  
            tempList.remove(tempList.size() - 1); // Backtrack to explore other combinations  
        }  
    } 
}
