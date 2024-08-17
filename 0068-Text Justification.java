class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> justifiedText = new ArrayList<>();  
        int n = words.length;  
        int index = 0;  

        while (index < n) {  
            int totalChars = words[index].length();  
            int last = index + 1;  

            // Determine how many words can fit in the current line  
            while (last < n && totalChars + words[last].length() + (last - index) <= maxWidth) {  
                totalChars += words[last].length();  
                last++;  
            }  

            StringBuilder line = new StringBuilder();  
            int numberOfWords = last - index;  
            int numberOfSpaces = maxWidth - totalChars;  

            // If we're at the last line, or the line only contains one word  
            if (last == n || numberOfWords == 1) {  
                for (int i = index; i < last; i++) {  
                    line.append(words[i]);  
                    if (i < last - 1) {  
                        line.append(" ");  
                    }  
                }  
                // Add remaining spaces at the end  
                while (line.length() < maxWidth) {  
                    line.append(" ");  
                }  
            } else {  
                // Calculate spaces between words  
                int space = numberOfSpaces / (numberOfWords - 1);  
                int extraSpaces = numberOfSpaces % (numberOfWords - 1);  
                
                for (int i = index; i < last; i++) {  
                    line.append(words[i]);  
                    if (i < last - 1) {  
                        int spacesToAdd = space + (i - index < extraSpaces ? 1 : 0);  
                        for (int j = 0; j < spacesToAdd; j++) {  
                            line.append(" ");  
                        }  
                    }  
                }  
            }  

            justifiedText.add(line.toString());  
            index = last; // Move to the next set of words  
        }  

        return justifiedText; 
    }
}
