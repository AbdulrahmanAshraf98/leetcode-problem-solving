class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
         int i = 0;
        int k= 1;
        int j= nums.length-1;
        int counter = 0;

        while (i<nums.length-2){
            while(k<j){
                if(nums[k]-nums[i]==diff){
                    while (k<j){
                        if(nums[j]-nums[k]==diff){
                            counter++;
                        }
                        j--;
                    }
                    j= nums.length-1;
                }
                k++;
            }
            i++;
            k=i+1;

        }
        return  counter ;
    }
}