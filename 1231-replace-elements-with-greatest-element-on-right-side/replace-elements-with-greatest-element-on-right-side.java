class Solution {
    public int[] replaceElements(int[] nums) {
         int maxRightElement = -1;
        for(int i = nums.length-1; i>=0;i--){
            int current= nums[i];
            nums[i]=maxRightElement;
            maxRightElement=Math.max(maxRightElement,current);
        }

        return nums;
    }
}