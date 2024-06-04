class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum=IntStream.of(nums).sum();
        for(int i = 0; i < nums.length; i++){
            rightSum -= nums[i];
            if(i != 0) leftSum += nums[i - 1];
            if(rightSum == leftSum) return i;
        }
        return -1;
    }
}