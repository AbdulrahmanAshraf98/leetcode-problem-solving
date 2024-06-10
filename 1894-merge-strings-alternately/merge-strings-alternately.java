class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder mergedString=new StringBuilder();
        int i = 0 ;
        int j = 0;
        char[] firstWordCharcheter=word1.toCharArray();
        char[] secondWordCharcheter=word2.toCharArray();
        int lengthWordLength= Math.max(word1.length(),word2.length());
        while(i<lengthWordLength||j<lengthWordLength){
            if(i<firstWordCharcheter.length){
                mergedString.append(firstWordCharcheter[i]);
            }
            if(j<secondWordCharcheter.length){
                mergedString.append(secondWordCharcheter[j]);
            }
                i++;
                j++;
        }
        System.gc();
        return mergedString.toString();
    }
}