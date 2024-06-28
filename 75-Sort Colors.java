class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int i = 0; // Pointer for 0s
        int j = 0; // Pointer for 1s
        int k = n - 1; // Pointer for 2s

        while (j <= k) {
            if (nums[j] == 1) {
                j++;
            } else if (nums[j] == 0) {
                swap(nums, i, j);
                i++;
                j++;
            } else if (nums[j] == 2) {
                swap(nums, j, k);
                k--;
            }
        }

        // Print the sorted array
        for (int a = 0; a < n; a++) {
            System.out.print(nums[a] + " ");
        }
    }

    public void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scn.nextInt();
        }

        Solution solution = new Solution();
        solution.sortColors(nums);
    }
}
