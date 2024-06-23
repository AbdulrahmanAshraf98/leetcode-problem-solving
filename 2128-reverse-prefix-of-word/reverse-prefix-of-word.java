class Solution {
    public String reversePrefix(String word, char ch) {
       int index = word.indexOf(ch);
        if(index==-1)return  word;
        char[] arr = word.toCharArray();
        for (int i = 0; i <= index / 2; i++) {
            // Swap characters at indices i and index - i
            char temp = arr[i];
            arr[i] = arr[index - i];
            arr[index - i] = temp;
        }
        return new String(arr);
    }
}