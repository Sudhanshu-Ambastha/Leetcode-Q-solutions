class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i]) == true) {
                int freq = map.get(arr[i]);
                map.put(arr[i], freq + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        HashSet<Integer> set = new HashSet<>(map.values());
        if (map.size() == set.size())
            return true;
        else
            return false;
    }
}
