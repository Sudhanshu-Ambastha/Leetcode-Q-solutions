class Solution {
    public int countBinarySubstrings(String s) {
        int n = s.length();
        int i = 0;
        int ans = 0;

        while (i < n) {
            int countZero = 0;
            int countOne = 0;

            if (s.charAt(i) == '0') {
                while (i < n && s.charAt(i) == '0') {
                    countZero++;
                    i++;
                }
                int j = i;
                while (j < n && s.charAt(j) == '1') {
                    countOne++;
                    j++;
                }
            } else {
                while (i < n && s.charAt(i) == '1') {
                    countOne++;
                    i++;
                }
                int j = i;
                while (j < n && s.charAt(j) == '0') {
                    countZero++;
                    j++;
                }
            }

            ans += Math.min(countZero, countOne);
        }

        return ans;
    }
}
