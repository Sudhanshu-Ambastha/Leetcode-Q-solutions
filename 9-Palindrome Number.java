class Solution {
    public boolean isPalindrome(int x) {
        int originalNum = x;
        int reversedNum = 0;

        while (x > 0) {
            int remainder = x % 10;
            reversedNum = reversedNum * 10 + remainder;
            x = x / 10;
        }

        return originalNum == reversedNum;
    
