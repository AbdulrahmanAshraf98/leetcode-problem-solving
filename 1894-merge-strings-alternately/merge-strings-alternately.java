class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder mergedString=new StringBuilder();
        int i = 0 ;
        int j = 0;
        int lengthWordLength= Math.max(word1.length(),word2.length());
        while(i<lengthWordLength||j<lengthWordLength){
            if(i<word1.length()){
                mergedString.append(word1.charAt(i));
            }
            if(j<word2.length()){
                mergedString.append(word2.charAt(j));
            }
                i++;
                j++;
        }
        return mergedString.toString();
    }
}