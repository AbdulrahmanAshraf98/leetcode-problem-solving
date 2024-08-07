class Solution {
    public int missingNumber(int[] nums) {
            // Arrays.sort(nums);
            // int arraySize=nums.length;
            // for(int i =0 ; i<arraySize;i++){
            //     if(nums[i]!=i){
            //         return i;
            //     }
            // }
            // return arraySize;
            int sum = IntStream.of(nums).sum();
            int n = nums.length;
            int expectedSum = n * (n + 1) / 2;
            return expectedSum-sum;
    }
}