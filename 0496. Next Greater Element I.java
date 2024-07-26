class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length; 
        int[] result = new int[n];
        Map<Integer, Integer> nextGreaterMap = new HashMap<>(); 
        Stack<Integer> st = new Stack<>();  

        for (int i = nums2.length - 1; i >= 0; i--) {  
            while (!st.isEmpty() && st.peek() <= nums2[i]) {  
                st.pop();  
            }  
            if (st.isEmpty()) {  
                nextGreaterMap.put(nums2[i], -1); 
            } else {  
                nextGreaterMap.put(nums2[i], st.peek());  
            }  
            st.push(nums2[i]);  
        }  
 
        for (int i = 0; i < n; i++) {  
            result[i] = nextGreaterMap.get(nums1[i]); 
        }  

        return result;
    }
}
