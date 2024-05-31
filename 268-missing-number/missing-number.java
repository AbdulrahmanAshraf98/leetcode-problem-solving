class Solution {
    public int missingNumber(int[] nums) {
            Arrays.sort(nums);
            int arraySize=nums.length;
            for(int i =0 ; i<arraySize;i++){
                if(nums[i]!=i){
                    return i;
                }
            }
            return arraySize;
    }
}