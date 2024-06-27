class Solution {
    public int heightChecker(int[] heights) {
        int N = heights.length;
        int[] expected = new int[N];
        System.arraycopy(heights, 0, expected, 0, N);
        Arrays.sort(expected);

        int mismatchCount = 0;
        for (int i = 0; i < N; i++) {
            if (heights[i] != expected[i]) {
                mismatchCount++;
            }
        }

        System.out.println(mismatchCount);
        return mismatchCount;
    }
}
