class Solution {
    public int scoreOfString(String s) {
        int i = 0 ;
        int k = i+1;
        int sum=0;
        while(k!=s.length()){
            sum+=Math.abs(s.charAt(i)-s.charAt(k));
            i++;
            k++;
        }
        return sum ;
    }
}