class Solution {
    public boolean isSubsequence(String s, String t) {
        Map<Character, List<Integer>> map = new HashMap<>();
        // Preprocess t
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, new ArrayList<>());
            }
            map.get(c).add(i);
        }

        int prev = -1;  // The previous character's index
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                return false;
            }
            int j = Collections.binarySearch(map.get(c), prev + 1);
            if (j < 0) {
                j = -j - 1;
            }
            if (j == map.get(c).size()) {
                return false;
            }
            prev = map.get(c).get(j);
        }
        return true;
    }
}
