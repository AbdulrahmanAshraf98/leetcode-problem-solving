class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character,Integer> wordCharacter= new HashMap<>();
        for(char c : s.toCharArray()){
            wordCharacter.put(c,wordCharacter.getOrDefault(c, 0) + 1);
        }
        for (char c:t.toCharArray()){
            if(!wordCharacter.containsKey(c))return false;
            else {
                wordCharacter.put(c, wordCharacter.get(c) - 1);
                if(wordCharacter.get(c) == 0) {
                    wordCharacter.remove(c);
                }
            }
        }
        return true ;
    }
}