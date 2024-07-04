class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> indexes=new ArrayList();
        StringBuilder subString= new StringBuilder();
        for(int  i = 0 ; i<s.length();i++){
           subString.append(s.charAt(i)); 
          if(subString.length() == p.length()){
           if(isAnagram(subString.toString(),p))indexes.add(i - p.length() + 1);
            subString.deleteCharAt(0);
          }
        }
        return indexes;
    }
    public   boolean isAnagram(String s, String anagram){
    if (s.length() != anagram.length()) {
            return false;
    }
        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
            counter[anagram.charAt(i) - 'a']--;
        }
        for (int count : counter) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}