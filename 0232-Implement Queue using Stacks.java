class MyQueue {  
    private Stack<Integer> stackPush; // Stack to push new elements  
    private Stack<Integer> stackPop;   // Stack to pop elements from   

    /** Initialize your data structure here. */  
    public MyQueue() {  
        stackPush = new Stack<>();  
        stackPop = new Stack<>();  
    }  

    /** Push element x to the back of queue. */  
    public void push(int x) {  
        stackPush.push(x); // Always push to stackPush  
    }  

    /** Removes the element from the front of the queue and returns it. */  
    public int pop() {  
        moveToPop(); // Ensure stackPop has the current front  
        return stackPop.pop(); // Pop from stackPop which has the front element  
    }  

    /** Get the front element. */  
    public int peek() {  
        moveToPop(); // Ensure stackPop has the current front  
        return stackPop.peek(); // Peek at the top of stackPop  
    }  

    /** Returns whether the queue is empty. */  
    public boolean empty() {  
        return stackPush.isEmpty() && stackPop.isEmpty(); // Both stacks are empty  
    }  

    /** Move elements from stackPush to stackPop if stackPop is empty. */  
    private void moveToPop() {  
        if (stackPop.isEmpty()) {  
            while (!stackPush.isEmpty()) {  
                stackPop.push(stackPush.pop()); // Transfer elements to stackPop  
            }  
        }  
    }  
}
