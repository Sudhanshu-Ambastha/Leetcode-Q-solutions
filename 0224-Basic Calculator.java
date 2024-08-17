class Solution {
    public int calculate(String s) {
        int currentNumber = 0;  
        int result = 0;  
        int sign = 1; // 1 means positive, -1 means negative  
        Stack<Integer> stack = new Stack<>();  

        for (char c : s.toCharArray()) {  
            if (Character.isDigit(c)) {  
                currentNumber = currentNumber * 10 + (c - '0'); // Build the current number  
            } else if (c == '+') {  
                result += sign * currentNumber; // Update the result  
                currentNumber = 0; // Reset current number  
                sign = 1; // Set sign to positive  
            } else if (c == '-') {  
                result += sign * currentNumber; // Update the result  
                currentNumber = 0; // Reset current number  
                sign = -1; // Set sign to negative  
            } else if (c == '(') {  
                // Push the result and the sign onto the stack  
                stack.push(result);  
                stack.push(sign);  
                // Reset for new expression  
                result = 0;  
                sign = 1;  
            } else if (c == ')') {  
                // Update the result with the last number  
                result += sign * currentNumber;  
                currentNumber = 0; // Reset current number  
                result *= stack.pop(); // Multiply with the last sign  
                result += stack.pop(); // Add the last result  
            }  
        }  

        // Don't forget to add the last number  
        result += sign * currentNumber;  

        return result;
    }
}
