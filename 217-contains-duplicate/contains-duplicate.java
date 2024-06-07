class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> nonDuplicateNumber = new HashSet<>();
        for(int num:nums){
            if(!nonDuplicateNumber.add(num))
                return true;
        }
        return false;
        // Arrays.sort(nums);
        // for (int i = 0; i < nums.length - 1; i++) {
        //     if (nums[i] == nums[i + 1]) {
        //         return true;
        //     }
        // }
        // return false;
    }
}