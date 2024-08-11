class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();  
        
        for (int asteroid : asteroids) {  
            boolean destroyed = false;  

            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {  
                int top = stack.peek();  
                if (Math.abs(asteroid) > top) {  
                    stack.pop(); // The asteroid moving right explodes  
                } else if (Math.abs(asteroid) == top) {  
                    stack.pop(); // Both asteroids explode  
                    destroyed = true;  
                    break;  
                } else {  
                    destroyed = true; // The incoming asteroid explodes  
                    break;  
                }  
            }  

            if (!destroyed) {  
                stack.push(asteroid); // Add the asteroid if it survives  
            }  
        }  
        
        // Convert the stack to an array  
        int[] result = new int[stack.size()];  
        for (int i = stack.size() - 1; i >= 0; i--) {  
            result[i] = stack.pop();  
        }  
        
        return result;
    }
}
