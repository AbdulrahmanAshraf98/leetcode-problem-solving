class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arrayProduct = 1;
        int zeroCount = 0;
        int[] answer = new int[nums.length];
        
        for(int num : nums){
            if(num != 0){
                arrayProduct *= num;
            } else {
                zeroCount++;
            }
        }
        
        for(int i = 0; i < nums.length; i++){
            if(zeroCount > 1){
                answer[i] = 0;
            } else if(nums[i] == 0){
                answer[i] = arrayProduct;
            } else if(zeroCount == 1){
                answer[i] = 0;
            } else {
                answer[i] = arrayProduct / nums[i];
            }
        }
        return answer;
    }
}
