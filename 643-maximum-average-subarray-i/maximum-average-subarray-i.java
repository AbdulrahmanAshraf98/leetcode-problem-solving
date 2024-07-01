class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double windowAvarage=0;
        double maxAvarage=0;
        double windowSum=0;
        for(int i = 0 ; i<k   ; i ++){
            windowSum+=nums[i];
        }
        windowAvarage=windowSum/k;
        maxAvarage=windowAvarage;
        for(int i = k ; i <nums.length ; i++){
            windowSum=windowSum-nums[i-k]+nums[i];
            windowAvarage= windowSum/k;
            maxAvarage= Math.max(windowAvarage,maxAvarage);
        }
        return maxAvarage;

    }
}