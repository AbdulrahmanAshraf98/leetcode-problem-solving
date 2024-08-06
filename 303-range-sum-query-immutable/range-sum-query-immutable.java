class NumArray {
    int [] nums;
    Map<String, Integer> cache;

    public NumArray(int[] nums) {
        this.nums=nums;
        this.cache = new HashMap<>();
    }
    
    public int sumRange(int left, int right) {
        String key = left + "-" + right;
         if (cache.containsKey(key)) {
            return cache.get(key);
        }
        int sum = 0;
        int i = left;
        while(i<=right){
            sum+=nums[i];
            i++;
        }
        cache.put(key, sum);
        return sum ; 
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */