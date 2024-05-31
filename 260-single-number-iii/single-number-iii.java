class Solution {
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            if(!set.contains(num)){
                set.add(num);
            }
            else {
                set.remove(num);
            }
        }
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
         }
         return result;
    }
}