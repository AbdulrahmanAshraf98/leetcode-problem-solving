class Solution {
    public String reverseWords(String s) {
        String[] words=s.split(" ");
        for(int i = 0 ; i <words.length; i++){
            char[] wordCharacter= words[i].toCharArray();

            for(int j=0 , k=wordCharacter.length-1;j<wordCharacter.length/2;j++,k-- ){
                char temp = wordCharacter[j];
                wordCharacter[j]=wordCharacter[k];
                wordCharacter[k]=temp;
            }
            words[i]= new String(wordCharacter);
        }
        return String.join(" ",words);
    }
}