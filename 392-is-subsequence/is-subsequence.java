class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0)return true;
        int i = 0 ; 
        int j = 0 ; 
        int sLength=s.length();
        int tLength=t.length();
        while(i<tLength&&j<sLength){
            if(t.charAt(i)==s.charAt(j)){
                if(sLength==j)return true ;
                j++;
            }
            i++;
        }
        return sLength==j;

    }
}