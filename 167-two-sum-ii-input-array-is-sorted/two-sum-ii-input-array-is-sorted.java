class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i =0 ; i<numbers.length;i++){
            int diff = target - numbers[i];
            int result= binarySearch(numbers,diff);
            if(result != -1 && result != i) {
                int[] indices = new int[]{i + 1, result + 1};
                Arrays.sort(indices);
                return indices; 
                }           
            }
        return new int[]{-1,-1};
    }
    public int binarySearch(int[] nums,int target){
        int left=0;
        int right= nums.length-1;
        while(left<=right){
            int middle = left + (right - left) / 2;
            int middleValue=nums[middle];
            if(target==middleValue)return middle;
            else if(middleValue<target) left=middle+1;
            else right=middle-1;
        }
        return -1;
    }
}