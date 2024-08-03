class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       boolean[] presence = new boolean[nums.length + 1];
        List<Integer> ans = new ArrayList<>();
        
        for (int num : nums) {
            presence[num] = true;
        }
        
        for (int i = 1; i < presence.length; i++) {
            if (!presence[i]) {
                ans.add(i);
            }
        }
        
        return ans;
    }

}