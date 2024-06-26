class Solution {
    public boolean isPalindrome(String s) {
        String palindromeWord= s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i = 0;
        int k = palindromeWord.length()-1;
        while(i<k){
            if(palindromeWord.charAt(i)!=palindromeWord.charAt(k)){
                return false ;
            }
            i++;
            k--;
        }
        return true;
    }
}