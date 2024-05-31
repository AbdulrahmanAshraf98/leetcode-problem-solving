class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        SortedSet<Integer> sortedSet = getSortedSet(nums);
        List<Integer> disappearedNumbers = new ArrayList<>();
       int arraySize=nums.length;
       for (int i = 1; i <= arraySize; i++) {
            if (!sortedSet.contains(i)) {
                disappearedNumbers.add(i);
            }
        }
        return disappearedNumbers; 
    }
    public SortedSet<Integer> getSortedSet(int[] nums) {
        SortedSet<Integer> sortedSet = new TreeSet<>();
        for (int num : nums) {
            sortedSet.add(num);
        }
        return sortedSet;
    }
}