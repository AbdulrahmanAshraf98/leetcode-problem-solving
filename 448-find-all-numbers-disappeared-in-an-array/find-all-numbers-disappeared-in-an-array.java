class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> numbers=new HashSet<>();
        List <Integer> ans = new ArrayList<>();
        for(int num:nums){
            numbers.add(num);
        }
        for(int i = 1 ; i<=nums.length;i++){
            if(!numbers.contains(i))ans.add(i);
        } 
        return ans;
    }

}