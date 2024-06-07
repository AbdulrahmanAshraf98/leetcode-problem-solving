class Solution {
    public int lengthOfLastWord(String s) {       
        String[] words=s.trim().split("[^a-zA-Z]+");
        return words[words.length-1].length() ;
    }
}