class Solution {
    public int strStr(String haystack, String needle) {
        int i = 0;
        int j=0;
        int firstOccursIndex=0;
        if(haystack.length()==0) return -1;
        while(i<haystack.length() && j < needle.length()){
            if(haystack.charAt(i)==needle.charAt(j)){
                j++;
                i++;
                firstOccursIndex=Math.min(i,firstOccursIndex);
            }
            else {
                i = i - j + 1;
                j = 0;
            }
            if (j == needle.length()) return i - j;

        }
        return -1;
    }
}