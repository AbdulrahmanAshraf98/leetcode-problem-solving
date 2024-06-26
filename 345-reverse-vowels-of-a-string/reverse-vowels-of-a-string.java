class Solution {
    private static final HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
    public String reverseVowels(String s) {
 
    char[] chars = s.toCharArray();
    int i =0 ; 
    int j = chars.length - 1 ;
    while(i<j){
            if(!vowels.contains(chars[i])){
                    i++;
            }
            else if (!vowels.contains(chars[j])){
                j--;
            }
            else{
            char temp = chars[i];
            chars[i]=chars[j];
            chars[j]=temp;
            i++;
            j--;
            }
          
    }
    return new String(chars);

    }
}