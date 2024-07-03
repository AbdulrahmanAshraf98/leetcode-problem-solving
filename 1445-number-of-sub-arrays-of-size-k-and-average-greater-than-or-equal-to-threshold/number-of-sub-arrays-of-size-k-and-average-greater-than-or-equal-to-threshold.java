class Solution {
    public int numOfSubarrays(int[] nums, int k, int threshold) {
        int count = 0;
        int currentWidowSum=0;
        for(int i =0 ; i<nums.length;i++){
            currentWidowSum+=nums[i];
            if(i>=k-1){
                 if(currentWidowSum/k>=threshold){
                    count++;
                 }
                 currentWidowSum-=nums[i-(k-1)];
            }
        }
        return count;
    }
}