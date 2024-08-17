class MinStack {  
    private Stack<Integer> stack;  
    private Stack<Integer> minStack;  

    public MinStack() {  
        // Initialize both stacks  
        stack = new Stack<>();  
        minStack = new Stack<>();  
    }  

    public void push(int val) {  
        // Push the value onto the main stack  
        stack.push(val);  
        // If the minStack is empty or the current value is less than or equal to the current minimum  
        // push it onto the minStack to maintain the minimum values  
        if (minStack.isEmpty() || val <= minStack.peek()) {  
            minStack.push(val);  
        }  
    }  

    public void pop() {  
        // Pop the top value from the stack  
        int topValue = stack.pop();  
        // If the popped value is the minimum value, pop it from the minStack as well  
        if (topValue == minStack.peek()) {  
            minStack.pop();  
        }  
    }  

    public int top() {  
        // Return the top element of the stack  
        return stack.peek();  
    }  

    public int getMin() {  
        // Return the minimum element from the minStack  
        return minStack.peek();  
    }  
}  

// Example usage:  
// MinStack minStack = new MinStack();  
// minStack.push(-2);  
// minStack.push(0);  
// minStack.push(-3);  
// System.out.println(minStack.getMin()); // return -3  
// minStack.pop();  
// System.out.println(minStack.top());    // return 0  
// System.out.println(minStack.getMin()); // return -2
