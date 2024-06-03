class Solution {
    public int searchInsert(int[] nums, int target) {
            int leftIndex=0;
        int rightIndex=nums.length-1;
        while(leftIndex<=rightIndex){
        int middleIndex = (leftIndex + rightIndex) / 2;
        int middleElement=nums[middleIndex];
        if(middleElement==target){
            return middleIndex;
        }
        else if (middleElement<target){
            leftIndex=middleIndex+1;
        }
        else{
            rightIndex=middleIndex-1;
        }
        }    
        return Math.max(rightIndex,leftIndex);
    }
}