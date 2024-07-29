class Solution {
    public String reformatNumber(String number) {
       StringBuilder cleanedNumber = new StringBuilder();  
        for (char c : number.toCharArray()) {  
            if (Character.isDigit(c)) {  
                cleanedNumber.append(c);  
            }  
        }  

        String digits = cleanedNumber.toString();  
        StringBuilder result = new StringBuilder();  
        int i = 0;  

        // Process the digits and group them  
        while (i < digits.length()) {  
            if (digits.length() - i > 4) {  
                // If there are more than 4 digits left, take a block of 3  
                result.append(digits.substring(i, i + 3)).append("-");  
                i += 3;  
            } else {  
                // If there are 4 or fewer digits left, handle according to the rules  
                if (digits.length() - i == 4) {  
                    result.append(digits.substring(i, i + 2)).append("-")  
                          .append(digits.substring(i + 2, i + 4));  
                } else {  
                    result.append(digits.substring(i));  
                }  
                break; // All digits have been processed  
            }  
        }  

        // Remove the last dash if it exists  
        if (result.length() > 0 && result.charAt(result.length() - 1) == '-') {  
            result.setLength(result.length() - 1);  
        }  

        return result.toString();  
    }  
}  
