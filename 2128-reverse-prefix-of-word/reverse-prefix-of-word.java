class Solution {
    public String reversePrefix(String word, char ch) {
          int index  =-1;
        for(int i = 0 ; i<word.length();i++){
            if(word.charAt(i)==ch){
                index =i;
                break;
            }
        }
        if(index==-1)return  word;
        char[] arr = word.toCharArray();
        for (int i = 0; i <= index / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[index - i];
            arr[index - i] = temp;
        }
        return new String(arr);
    }
}