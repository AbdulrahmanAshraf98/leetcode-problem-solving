class Solution {
    public int searchInsert(int[] nums, int target) {
        int leftIndex=0;
        int rightIndex=nums.length-1;
        int middleIndex=0;;
        int middleValue=nums[middleIndex];
        while (leftIndex<=rightIndex){
             middleIndex=(leftIndex+rightIndex)/2;
             middleValue=nums[middleIndex];
            if(middleValue==target)return  middleIndex;
            else if(middleValue<target)leftIndex=middleIndex+1;
            else rightIndex=middleIndex-1;
        }
        return  leftIndex;
    }
}