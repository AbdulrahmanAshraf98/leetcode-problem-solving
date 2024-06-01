class Solution {
    public boolean isValid(String s) {
        Stack<Character> closeParenthesses = new Stack<Character>();
        for(char c : s.toCharArray()){
            if(c=='(')
                closeParenthesses.push(')');
            else if(c=='{')
                closeParenthesses.push('}');
            else  if(c=='[')
                closeParenthesses.push(']');
            else if(closeParenthesses.isEmpty()||c!=closeParenthesses.pop())
            return false ;
        }
        return closeParenthesses.isEmpty();
    }
}