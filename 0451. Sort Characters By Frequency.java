class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();  
        for (char c : s.toCharArray()) {  
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);  
        }  

        // Step 2: Use a priority queue to sort characters by frequency  
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> frequencyMap.get(b) - frequencyMap.get(a));  
        maxHeap.addAll(frequencyMap.keySet());  

        // Step 3: Build the output string based on frequency  
        StringBuilder sortedString = new StringBuilder();  
        while (!maxHeap.isEmpty()) {  
            char currentChar = maxHeap.poll();  
            int currentFreq = frequencyMap.get(currentChar);  
            for (int i = 0; i < currentFreq; i++) {  
                sortedString.append(currentChar);  
            }  
        }  

        return sortedString.toString(); 
    }
}
