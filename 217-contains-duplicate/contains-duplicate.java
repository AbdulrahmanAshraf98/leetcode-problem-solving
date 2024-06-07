class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> nonDuplicateNumbe = new HashMap<>();
        for(int num:nums){
            if(!nonDuplicateNumbe.containsKey(num))
                nonDuplicateNumbe.put(num, 1);
            else return true;
        }
        return false;
    }
}