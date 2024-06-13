class Solution {
    public int trap(int[] arr) {
        int n = arr.length;
       int result = 0;
        for(int i = 0; i < n; i++){
            int leftMax = Integer.MIN_VALUE;
            for(int j = 0; j <= i; j++){
                if(arr[j] > leftMax){
                    leftMax = arr[j];
                }
            }
            int rightMax = Integer.MIN_VALUE;
            for(int j = i; j < n; j++){
                if(arr[j] > rightMax){
                    rightMax = arr[j];
                }
            }
            int ans = Math.min(leftMax, rightMax);
            int water = ans - arr[i];
            result +=water;
        }
        return result;
    }
}
