class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();  
        Map<String, List<String>> map = new HashMap<>();  

        for (String str : strs) {  
            char[] charArray = str.toCharArray();  
            Arrays.sort(charArray);  
            String sortedStr = new String(charArray);  

            if (!map.containsKey(sortedStr)) {  
                map.put(sortedStr, new ArrayList<>());  
            }  
            map.get(sortedStr).add(str);  
        }  

        for (List<String> group : map.values()) {  
            result.add(group);  
        }  

        return result;  
    }
}
