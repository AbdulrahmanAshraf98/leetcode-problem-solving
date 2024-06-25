class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int k = nums.length-1;
        while(i<k){
            if(nums[i]%2==0) i++;
            else if (nums[k]%2==1) k--;
            else {
                int temp = nums[i];
                nums[i]=nums[k];
                nums[k]=temp;
            }
        }
        return nums;
    }
}