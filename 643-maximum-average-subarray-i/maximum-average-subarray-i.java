class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAverage = Integer.MIN_VALUE;
        double windowSum = 0;
        for(int i = 0; i < k; i++){
            windowSum += nums[i];
        }
        maxAverage = Math.max(maxAverage, windowSum / k);
        for(int i = k; i < nums.length; i++){
            windowSum = windowSum - nums[i - k] + nums[i];
            maxAverage = Math.max(maxAverage, windowSum / k);
        }
        return maxAverage;

    }
}