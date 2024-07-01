class Solution {
   public int maxVowels(String s, int k) {
        Set<Character> vowelsCharacter = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int maxCount = 0;
        int currentCount = 0;
        for (int i = 0; i < k; i++) {
            if (vowelsCharacter.contains(s.charAt(i))) {
                currentCount++;
            }
        }
        maxCount = currentCount;
        for (int i = k; i < s.length(); i++) {
            if (vowelsCharacter.contains(s.charAt(i - k))) {
                currentCount--;
            }
            if (vowelsCharacter.contains(s.charAt(i))) {
                currentCount++;
            }
            maxCount = Math.max(maxCount, currentCount);
        }
        return maxCount;
    }

}