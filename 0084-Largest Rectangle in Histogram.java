class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();  
        int maxArea = 0;  
        int index = 0;  

        // Iterate through the heights  
        while (index < heights.length) {  
            // If this bar is higher than the bar at stack top, push it to the stack  
            if (stack.isEmpty() || heights[stack.peek()] <= heights[index]) {  
                stack.push(index++);  
            } else {  
                // Pop the top  
                int top = stack.pop();  
                // Calculate the area with heights[top] as the smallest (or minimum height) bar 'h'  
                int area = heights[top] * (stack.isEmpty() ? index : index - stack.peek() - 1);  
                // Update max area, if needed  
                maxArea = Math.max(maxArea, area);  
            }  
        }  

        // Now pop the remaining bars from stack and calculate area  
        while (!stack.isEmpty()) {  
            int top = stack.pop();  
            int area = heights[top] * (stack.isEmpty() ? index : index - stack.peek() - 1);  
            maxArea = Math.max(maxArea, area);  
        }  

        return maxArea; 
    }
}
