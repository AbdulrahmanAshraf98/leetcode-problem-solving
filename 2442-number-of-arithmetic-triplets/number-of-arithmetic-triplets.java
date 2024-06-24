class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int counter = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            int k = i + 1;
            int j = i + 2;
            while (j < nums.length) {
                if (nums[k] - nums[i] == diff && nums[j] - nums[k] == diff) {
                    counter++;
                    j++;
                } else if (nums[k] - nums[i] < diff || nums[j] - nums[k] > diff) {
                    k++;
                    if (k == j) {
                        j++;
                    }
                } else {
                    j++;
                }
            }
        }
        return counter;
    }
}
