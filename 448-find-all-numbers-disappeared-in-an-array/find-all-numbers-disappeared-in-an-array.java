class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       int[] presence = new int[nums.length + 1];
        List<Integer> ans = new ArrayList<>();
        
        for (int num : nums) {
            presence[num] = 1;
        }
        
        for (int i = 1; i < presence.length; i++) {
            if (presence[i] == 0) {
                ans.add(i);
            }
        }
        
        return ans;
    }

}