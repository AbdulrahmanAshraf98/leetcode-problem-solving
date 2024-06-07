class Solution {
    public int lengthOfLastWord(String s) {       
        // String[] words=s.trim().split("\\s+");
        // return words[words.length-1].length() ;
        int countLastWord=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' ')countLastWord++;
            else if (countLastWord>0)return countLastWord;
        }
        return countLastWord;
    }
}