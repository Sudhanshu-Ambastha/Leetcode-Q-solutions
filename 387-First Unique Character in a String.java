class Solution {
    public int firstUniqChar(String s) {
        int[] count = new int[26];
        Queue<Character> queue = new LinkedList<>();

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
            if (count[c - 'a'] == 1) {
                queue.add(c);
            }
            while (!queue.isEmpty() && count[queue.peek() - 'a'] > 1) {
                queue.remove();
            }
        }

        if (queue.isEmpty()) {
            return -1;
        } else {
            return s.indexOf(queue.peek());
        }
    }
}
