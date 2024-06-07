class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> nonDuplicateNumber = new HashSet<>();
        for(int num:nums){
            if(!nonDuplicateNumber.add(num))
                return true;
        }
        return false;
    }
}