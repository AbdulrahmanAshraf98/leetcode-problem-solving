class Solution {
    public String firstPalindrome(String[] words) {
       for(String word :words){
        int i = 0 ;
        int k = word.length()-1;
        boolean  isPalindromic = true;
        while(i<k){
            if(word.charAt(i)!=word.charAt(k)  ){
                isPalindromic = false ;
                break;
            }
            i++;
            k--;
        }
        if(isPalindromic)return word;
       } 
       return "";
    }
}