class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) {  
            return 0;  
        }  

        // Sort the balloons by their ending points  
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));  

        int arrows = 1;  // Start with one arrow  
        int currentEnd = points[0][1];  // The end of the first balloon  

        for (int i = 1; i < points.length; i++) {  
            // If the current balloon starts after the last arrow's position, we need a new arrow  
            if (points[i][0] > currentEnd) {  
                arrows++;  
                currentEnd = points[i][1];  // Update the current end to the new balloon's end  
            }  
            // If it overlaps, we do not increase the arrow count  
        }  

        return arrows;  
    }
}
