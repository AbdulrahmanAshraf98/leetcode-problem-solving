class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> uniqueCharcter = new LinkedHashMap<>();
        Set<Character> duplicates = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (uniqueCharcter.containsKey(c)) {
                uniqueCharcter.remove(c);
                duplicates.add(c);

            } 
            else if(!duplicates.contains(c)) {
                uniqueCharcter.put(c, i);
            }
        }
        return uniqueCharcter.isEmpty() ? -1 : uniqueCharcter.values().iterator().next();

        
    }
}