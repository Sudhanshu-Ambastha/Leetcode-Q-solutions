class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();  

        for (int i = 0; i < s.length(); i++) {  
            char curr = s.charAt(i);  

            // If it's an opening bracket, push it onto the stack  
            if (curr == '(' || curr == '{' || curr == '[') {  
                st.push(curr);  
            } else {  
                // If it's a closing bracket, we need to check the stack  
                if (st.isEmpty()) {  
                    return false; // No opening bracket for this closing  
                }  

                // Check for matching pairs  
                char top = st.pop(); // Get the top of the stack  

                if ((curr == ')' && top != '(') ||   
                    (curr == '}' && top != '{') ||   
                    (curr == ']' && top != '[')) {  
                    return false; // Mismatched brackets  
                }  
            }  
        }  

        // If the stack is empty, all brackets are matched  
        return st.isEmpty();
    }
}
