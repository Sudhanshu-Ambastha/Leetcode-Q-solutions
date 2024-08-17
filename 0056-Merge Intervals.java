class Solution {
    public int[][] merge(int[][] intervals) {
        // First, we need to sort the intervals based on the start time  
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));  

        List<int[]> merged = new LinkedList<>();  

        for (int[] interval : intervals) {  
            // If merged list is empty or there is no overlap, simply add the interval  
            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {  
                merged.add(interval);  
            } else {  
                // There is an overlap, so we merge the current interval with the last interval in merged list  
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);  
            }  
        }  

        // Convert the List to a 2D array to return  
        return merged.toArray(new int[merged.size()][]);  
    }  
}
