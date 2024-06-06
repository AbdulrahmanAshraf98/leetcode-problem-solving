class MinStack {
    private ArrayList<HashMap<String,Integer>> stack;
    private int stackLength = 0;

    public MinStack() {
        stack = new ArrayList<>();
    }
    
    public void push(int val) {
        HashMap<String, Integer> newElement = new HashMap<>();
        newElement.put("val", val);
        int min = val;
        if (this.stackLength != 0) {
            min = Math.min(val, this.getMin());
        }
        newElement.put("min", min);
        stack.add(newElement);
        stackLength++; 
    }
    
    public void pop() {
        if (this.stackLength != 0) {
            stack.remove(stack.size() - 1);
            stackLength--;
        } 
    }
    
    public int top() {
        if (this.stackLength != 0) {
            return stack.get(stackLength - 1).get("val");
        }
        return -1; 
    }
    
    public int getMin() {
        if (this.stackLength != 0) {
            return stack.get(stackLength - 1).get("min");
        }
        return -1; 
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
