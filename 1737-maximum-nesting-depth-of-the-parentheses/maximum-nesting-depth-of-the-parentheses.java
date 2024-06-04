class Solution {
    public int maxDepth(String s) {
        Stack<Character> nestingOpenedParentheses=new Stack<>();
        int maxNumber=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                nestingOpenedParentheses.push(c);
            }
            else if (c==')')nestingOpenedParentheses.pop();
            maxNumber=  Math.max(maxNumber,nestingOpenedParentheses.size());
        }
        return maxNumber;
    }
}