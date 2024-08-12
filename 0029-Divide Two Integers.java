class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {  
            return Integer.MAX_VALUE;  
        }  

        // Determine the sign of the quotient  
        boolean isNegative = (dividend < 0) ^ (divisor < 0);  

        // Work with positive values for dividend and divisor  
        long absDividend = Math.abs((long) dividend);  
        long absDivisor = Math.abs((long) divisor);  
        long quotient = 0;  

        // Perform the division using bit manipulation  
        while (absDividend >= absDivisor) {  
            long tempDivisor = absDivisor, multiple = 1;  

            // Double the divisor until it is larger than the dividend  
            while (absDividend >= (tempDivisor << 1)) {  
                tempDivisor <<= 1;  
                multiple <<= 1;  
            }  

            // Subtract the divisor from the dividend  
            absDividend -= tempDivisor;  
            // Add the multiples to the quotient  
            quotient += multiple;  
        }  

        // Apply the sign to the quotient  
        quotient = isNegative ? -quotient : quotient;  

        // Ensure the quotient is within the 32-bit signed integer range  
        return (int) quotient;  
    }  
}  
