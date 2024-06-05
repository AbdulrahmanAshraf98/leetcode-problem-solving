class Solution {
    public String removeStars(String s) {
        Stack<Character> stringCharacter = new Stack<>();
        for(char c:s.toCharArray()){
            if(c!='*')stringCharacter.push(c);
            else if(!stringCharacter.isEmpty()) stringCharacter.pop();
        }
        StringBuilder sb = new StringBuilder();
        for(Character ch : stringCharacter) {
            sb.append(ch);
        }
        
        return sb.toString();
    }
}