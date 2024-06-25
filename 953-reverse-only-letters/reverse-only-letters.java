class Solution {
    public String reverseOnlyLetters(String s) {
        char[] wordCharacter  = s.toCharArray();
        int i=0;
        int j = s.length()-1;
        while(i<j){
             if (!Character.isLetter(wordCharacter[i])) {
                i++;
             }
             else if (!Character.isLetter(wordCharacter[j])) {
                j--;
            } 
            else {
                char temp = wordCharacter[i];
                wordCharacter[i] = wordCharacter[j];
                wordCharacter[j] = temp;
                i++;
                j--;
            }
        }
        return new String(wordCharacter);
    }
}