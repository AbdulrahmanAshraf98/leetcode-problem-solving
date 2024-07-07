class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        HashMap<Integer,Integer> numbersCount=new HashMap<>();
        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);
        for(int i =0 ; i<sortedNums.length;i++){
           if(!numbersCount.containsKey(sortedNums[i]))numbersCount.put(sortedNums[i],i);
        }
        int[] answer= new int[nums.length];
        for(int i =0 ; i<sortedNums.length;i++){
            answer[i]=numbersCount.get(nums[i]);
        }
        return answer;
    }
}