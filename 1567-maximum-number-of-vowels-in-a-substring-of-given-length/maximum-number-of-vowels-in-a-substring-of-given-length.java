class Solution {
   public int maxVowels(String s, int k) {
        int[] isVowel = new int[26];
        isVowel['a' - 'a'] = 1;
        isVowel['e' - 'a'] = 1;
        isVowel['i' - 'a'] = 1;
        isVowel['o' - 'a'] = 1;
        isVowel['u' - 'a'] = 1;        
        int maxCount = 0;
        int currentCount = 0;
        for (int i = 0; i < k; i++) {
            currentCount += isVowel[s.charAt(i) - 'a'];
        }
        maxCount = currentCount;
        for (int i = k; i < s.length(); i++) {
            currentCount -= isVowel[s.charAt(i - k) - 'a'];
            currentCount += isVowel[s.charAt(i) - 'a'];
            maxCount = Math.max(maxCount, currentCount);
        }
        return maxCount;
    }

}