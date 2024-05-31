class Solution {
    public int removeDuplicates(int[] nums) {
         if (nums.length <= 1) {
            return nums.length;
        }
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        int j=0;
        for(int num:nums ){
           if(uniqueNumbers.add(num)){
                nums[j]=num;
                j++;
           }
        }
        return j;
    }
}