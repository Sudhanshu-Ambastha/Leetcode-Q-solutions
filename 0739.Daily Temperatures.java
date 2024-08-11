class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;  
        int[] answer = new int[n];  
        Stack<Integer> stack = new Stack<>();  

        for (int i = 0; i < n; i++) {  
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {  
                int idx = stack.pop(); // Get the index of the colder temperature  
                answer[idx] = i - idx; // Calculate the difference in days  
            }  
            stack.push(i); // Push the current index onto the stack  
        }  

        return answer;
    }
}
