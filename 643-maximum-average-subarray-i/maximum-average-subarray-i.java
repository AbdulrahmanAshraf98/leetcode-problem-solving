class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAverage = Integer.MIN_VALUE;
        double windowSum = 0;
        for(int i =0 ; i<nums.length;i++){
             windowSum+=nums[i];
            if(i>=k-1){
              maxAverage=Math.max(maxAverage,windowSum/k);
              windowSum-=nums[i-(k-1)];
            }
        }
        return maxAverage;

    }
}