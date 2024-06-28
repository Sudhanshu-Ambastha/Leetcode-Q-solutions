class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int evenIndex = 0;
        int oddIndex = n - 1;

        for (int num : nums) {
            if (num % 2 == 0) {
                arr[evenIndex] = num;
                evenIndex++;
            } else {
                arr[oddIndex] = num;
                oddIndex--;
            }
        }

        return arr;
    }
}
