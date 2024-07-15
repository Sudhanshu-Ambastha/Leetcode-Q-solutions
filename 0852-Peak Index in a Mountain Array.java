class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n - 1; i++) {
            int curr = arr[i];
            int left = arr[i - 1];
            int right = arr[i + 1];
            if (curr > left && curr > right) {
                return i;
            }
        }
        return -1;
    }
}
