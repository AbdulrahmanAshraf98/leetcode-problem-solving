class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxWindowSum=0;
        double windowSum=0;
        for(int i = 0 ; i<k   ; i ++){
            windowSum+=nums[i];
        }
        maxWindowSum=windowSum;
        for(int i = k ; i <nums.length ; i++){
            windowSum+=nums[i]-nums[i-k];
            maxWindowSum= Math.max(maxWindowSum,windowSum);
        }
        return maxWindowSum/k;

    }
}