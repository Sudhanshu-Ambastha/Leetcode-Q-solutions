class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a); 
        
        for (int stone : stones) {
            maxHeap.offer(stone);
        }
        
        while (maxHeap.size() > 1) {
            int first = maxHeap.poll(); 
            int second = maxHeap.poll(); 
            
            if (first != second) {
                maxHeap.offer(first - second);
            }
        }
        
        return maxHeap.isEmpty() ? 0 : maxHeap.poll();
    }
}
