class Solution {
    public int searchInsert(int[] nums, int target) {
      int leftIndex=0;
        int rightIndex=nums.length-1;
        while (leftIndex<=rightIndex){
            int middleIndex=(leftIndex+rightIndex)/2;
            int middleValue=nums[middleIndex];
            if(middleValue==target)return  middleIndex;
            else if(middleValue<target)leftIndex=middleIndex+1;
            else rightIndex=middleIndex-1;
        }
        return  leftIndex;
    }
}