class Solution {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String[] arr1 = new String[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.toString(nums[i]);
        }

        Arrays.sort(arr1, (a, b) -> {
            String str1 = a + b;
            String str2 = b + a;
            return str2.compareTo(str1);
        });

        String ans = "";
        for (int i = 0; i < n; i++) {
            ans = ans + arr1[i];
        }
        return ans;
    }
}
