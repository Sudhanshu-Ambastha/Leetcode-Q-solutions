class Solution {
    public String addStrings(String num1, String num2) {
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        char[] result = new char[Math.max(num1.length(), num2.length()) + 1];
        int k = result.length - 1;

        while (i >= 0 || j >= 0 || carry != 0) {
            int n1 = (i >= 0) ? num1.charAt(i--) - '0' : 0;
            int n2 = (j >= 0) ? num2.charAt(j--) - '0' : 0;
            int sum = n1 + n2 + carry;
            carry = sum / 10;
            result[k--] = (char) (sum % 10 + '0');
        }

        int start = 0;
        while (start < result.length - 1 && result[start] == '\u0000') {
            start++;
        }

        return new String(result, start, result.length - start);
    }
}
